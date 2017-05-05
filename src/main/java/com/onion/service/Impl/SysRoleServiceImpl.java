package com.onion.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onion.entity.SysRole;
import com.onion.mapper.SysRoleMapper;
import com.onion.service.ISysRoleService;
import org.springframework.stereotype.Service;

/**
 * Created by lhd on 2017/5/4.
 * 角色service实现类
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements ISysRoleService{
}
