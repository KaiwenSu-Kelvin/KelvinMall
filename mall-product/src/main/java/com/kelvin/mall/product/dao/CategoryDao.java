package com.kelvin.mall.product.dao;

import com.kelvin.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 14:45:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
