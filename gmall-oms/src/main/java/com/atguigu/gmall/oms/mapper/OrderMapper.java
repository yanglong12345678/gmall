package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author YngLong
 * @email 446443964@atguigu.com
 * @date 2020-07-21 12:39:09
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
