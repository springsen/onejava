package cn.springsen.onejava.mapper;

import cn.springsen.onejava.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jason zz
 * @since 2021-10-03
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<Long> getNavMenuIds(Long userId);

    List<SysUser> listByMenuId(Long menuId);
}
