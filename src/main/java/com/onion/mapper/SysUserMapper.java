package com.onion.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.onion.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zhongmc on 2017/5/4.
 * 用户mapper
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser selectUserByUsername(@Param("username") String username);
}
