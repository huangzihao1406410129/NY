package com.ks.ny.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ks.ny.dao.UserDao;
import com.ks.ny.entity.User;
import com.ks.ny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-05-26 16:35:28
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}

