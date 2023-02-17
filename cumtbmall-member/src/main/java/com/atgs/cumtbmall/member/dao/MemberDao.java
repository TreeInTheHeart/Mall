package com.atgs.cumtbmall.member.dao;

import com.atgs.cumtbmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gaosong
 * @email gaosong@gmail.com
 * @date 2021-12-05 17:15:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
