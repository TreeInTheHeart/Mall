package com.atgs.cumtbmall.order.dao;

import com.atgs.cumtbmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:30:36
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
