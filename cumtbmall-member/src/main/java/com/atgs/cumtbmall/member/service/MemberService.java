package com.atgs.cumtbmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atgs.common.utils.PageUtils;
import com.atgs.cumtbmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:15:06
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

