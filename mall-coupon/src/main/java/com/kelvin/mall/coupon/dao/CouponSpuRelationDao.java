package com.kelvin.mall.coupon.dao;

import com.kelvin.mall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:29:50
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
