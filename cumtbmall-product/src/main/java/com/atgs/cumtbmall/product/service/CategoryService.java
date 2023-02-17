package com.atgs.cumtbmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgs.common.utils.PageUtils;
import com.atgs.cumtbmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 10:06:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

