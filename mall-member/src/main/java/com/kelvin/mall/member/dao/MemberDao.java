package com.kelvin.mall.member.dao;

import com.kelvin.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:37:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
