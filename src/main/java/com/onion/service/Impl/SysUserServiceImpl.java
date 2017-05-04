package com.onion.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onion.entity.SysUser;
import com.onion.mapper.SysUserMapper;
import com.onion.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * Created by zhongmc on 2017/5/4.
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
