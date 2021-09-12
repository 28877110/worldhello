package org.learn.worldhello.service;

import org.learn.worldhello.entity.User;
import org.learn.worldhello.exception.MyException;
import org.learn.worldhello.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020-05-23 14:22
 * @Created by smallfish
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    @Transactional
    public void insertUseList() throws MyException {
        User user = new User();
        user.setAge(20);
        user.setId(22L);
        user.setName("yx3");
        userMapper.insert(user);

        User user2 = new User();
        user2.setAge(20);
        user2.setId(22L);
        user2.setName("yx4");
        int insert = userMapper.insert(user2);
        System.out.println(insert);
    }
}
