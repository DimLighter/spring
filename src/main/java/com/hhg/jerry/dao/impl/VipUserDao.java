package com.hhg.jerry.dao.impl;

import com.hhg.jerry.bean.User;
import com.hhg.jerry.dao.IUserDao;
import org.springframework.stereotype.Service;

/**
 * Created by lining on 2018/9/11.
 */
@Service
public class VipUserDao implements IUserDao {
    public Long add(User user) {
        System.out.println("VipUserDao add method");
        return 0L;
    }

    public User getById(Long id) {
        System.out.println("VipUserDao get method");
        return null;
    }

    public boolean delete(Long id) {
        System.out.println("VipUserDao delete method");
        return false;
    }
}
