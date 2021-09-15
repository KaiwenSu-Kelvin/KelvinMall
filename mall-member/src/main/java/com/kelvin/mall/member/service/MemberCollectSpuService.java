package com.kelvin.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kelvin.common.utils.PageUtils;
import com.kelvin.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author KelvinSu
 * @email 1093792153@qq.com
 * @date 2021-09-15 16:37:23
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

