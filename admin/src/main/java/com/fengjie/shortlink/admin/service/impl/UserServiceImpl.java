package com.fengjie.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengjie.shortlink.admin.dao.entity.UserDO;
import com.fengjie.shortlink.admin.dao.mapper.UserMaper;
import com.fengjie.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMaper, UserDO> implements UserService {
}
