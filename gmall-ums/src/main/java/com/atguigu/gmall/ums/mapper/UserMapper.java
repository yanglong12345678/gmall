package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author YngLong
 * @email 446443964@atguigu.com
 * @date 2020-07-21 10:53:25
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
