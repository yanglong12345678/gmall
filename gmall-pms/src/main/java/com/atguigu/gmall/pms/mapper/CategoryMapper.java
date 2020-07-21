package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author YngLong
 * @email 446443964@atguigu.com
 * @date 2020-07-20 18:44:46
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
