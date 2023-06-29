package com.ks.ny.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ks.ny.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-26 16:35:25
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {


}

