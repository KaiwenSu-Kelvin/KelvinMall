package com.kelvin.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelvin.common.utils.PageUtils;
import com.kelvin.mall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:29:50
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

