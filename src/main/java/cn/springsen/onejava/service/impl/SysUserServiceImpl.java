package cn.springsen.onejava.service.impl;

import cn.springsen.onejava.entity.SysUser;
import cn.springsen.onejava.mapper.SysUserMapper;
import cn.springsen.onejava.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jason zz
 * @since 2021-10-03
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser getByUsername(String username) {
        return null;
    }

    @Override
    public String getUserAuthorityInfo(Long userId) {
        return null;
    }

    @Override
    public void clearUserAuthorityInfo(String username) {

    }

    @Override
    public void clearUserAuthorityInfoByRoleId(Long roleId) {

    }

    @Override
    public void clearUserAuthorityInfoByMenuId(Long menuId) {

    }
}
