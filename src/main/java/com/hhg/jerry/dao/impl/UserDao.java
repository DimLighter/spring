package com.hhg.jerry.dao.impl;

import com.hhg.jerry.bean.User;
import com.hhg.jerry.dao.IUserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by lining on 2018/9/11.
 */
@Service("userDao")
@Primary
public class UserDao implements IUserDao{
    public Long add(User user){
        System.out.println("UserDao add method");
        return 0L;
    }

    public User getById(Long id){
        System.out.println("UserDao get method");
        User u = new User();
        u.setId(id);
        u.setName("DummyUser");
        return u;
    }

    public boolean delete(Long id){
        System.out.println("UserDao delete method");
        return true;
    }
}
