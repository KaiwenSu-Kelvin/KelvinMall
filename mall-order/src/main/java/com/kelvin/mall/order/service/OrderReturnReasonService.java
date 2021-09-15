package com.kelvin.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelvin.common.utils.PageUtils;
import com.kelvin.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:49:58
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

