package com.atgs.cumtbmall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atgs.common.utils.PageUtils;
import com.atgs.common.utils.Query;

import com.atgs.cumtbmall.product.dao.CategoryDao;
import com.atgs.cumtbmall.product.entity.CategoryEntity;
import com.atgs.cumtbmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> entities = categoryDao.selectList(null);
        //2.组装成父子结构
        List<CategoryEntity> level1Menus = entities.stream()
                .filter(e -> e.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                })
                .sorted((m1, m2) -> {
                    return (m1.getSort()==null?0:m1.getSort()) - (m2.getSort()==null?0:m2.getSort());
                })
                .collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 1、检查当前删除的菜单，是否被别的地方引用
        //
        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 递归在所有菜单中查找当前菜单的子菜单
     *
     * @param root 当前菜单
     * @param all  所有菜单
     * @return 当前菜单的子菜单
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> chlidren = all.stream()
                .filter(e -> {
                    return e.getParentCid() == root.getCatId();
                })
                .map(e -> {
                    //递归查找子菜单
                    e.setChildren(getChildrens(e, all));
                    return e;
                })
                .sorted((m1, m2) -> {
                    return (m1.getSort()==null?0:m1.getSort()) - (m2.getSort()==null?0:m2.getSort());
                })
                .collect(Collectors.toList());
        return chlidren;
    }

}