package com.atgs.cumtbmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgs.common.utils.PageUtils;
import com.atgs.cumtbmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:30:36
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

