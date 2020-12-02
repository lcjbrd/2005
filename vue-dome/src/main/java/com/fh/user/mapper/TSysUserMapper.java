package com.fh.user.mapper;

import com.fh.user.entity.TSysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcj
 * @since 2020-11-30
 */
@Repository
@Mapper
public interface TSysUserMapper extends BaseMapper<TSysUser> {

}
