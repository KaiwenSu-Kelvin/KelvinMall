package com.kelvin.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelvin.common.utils.PageUtils;
import com.kelvin.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 14:45:21
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

