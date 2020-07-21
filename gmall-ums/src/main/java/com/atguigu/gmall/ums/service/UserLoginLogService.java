package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.ums.entity.UserLoginLogEntity;

import java.util.Map;

/**
 * 用户登陆记录表
 *
 * @author YngLong
 * @email 446443964@atguigu.com
 * @date 2020-07-21 10:53:24
 */
public interface UserLoginLogService extends IService<UserLoginLogEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

