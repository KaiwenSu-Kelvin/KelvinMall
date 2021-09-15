package com.kelvin.mall.order.dao;

import com.kelvin.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:49:58
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
