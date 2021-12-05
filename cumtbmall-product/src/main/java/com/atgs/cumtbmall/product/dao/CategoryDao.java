package com.atgs.cumtbmall.product.dao;

import com.atgs.cumtbmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 10:06:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
