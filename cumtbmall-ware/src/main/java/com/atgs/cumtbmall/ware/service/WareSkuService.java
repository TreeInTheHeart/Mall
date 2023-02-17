package com.atgs.cumtbmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgs.common.utils.PageUtils;
import com.atgs.cumtbmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:37:57
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

