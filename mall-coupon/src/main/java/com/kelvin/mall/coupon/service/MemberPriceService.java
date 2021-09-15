package com.kelvin.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelvin.common.utils.PageUtils;
import com.kelvin.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:29:50
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

