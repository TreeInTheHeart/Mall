package com.atgs.cumtbmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgs.common.utils.PageUtils;
import com.atgs.cumtbmall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:15:06
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

