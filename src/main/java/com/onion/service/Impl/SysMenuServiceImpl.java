package com.onion.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onion.entity.SysMenu;
import com.onion.entity.SysRole;
import com.onion.mapper.SysMenuMapper;
import com.onion.mapper.SysRoleMapper;
import com.onion.service.ISysMenuService;
import com.onion.service.ISysRoleService;
import org.springframework.stereotype.Service;

/**
 * Created by lhd on 2017/5/4.
 * 菜单service实现类
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper,SysMenu> implements ISysMenuService{
}
