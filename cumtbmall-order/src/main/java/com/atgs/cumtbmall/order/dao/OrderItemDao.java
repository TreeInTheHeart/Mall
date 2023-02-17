package com.atgs.cumtbmall.order.dao;

import com.atgs.cumtbmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:30:36
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
