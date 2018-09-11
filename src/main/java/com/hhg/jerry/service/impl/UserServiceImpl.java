package com.hhg.jerry.service.impl;

import com.hhg.jerry.bean.User;
import com.hhg.jerry.dao.IUserDao;
import com.hhg.jerry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by lining on 2018/9/11.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired//(required = false)
    @Qualifier("vipUserDao")
    private IUserDao iUserDao;

    public Long add(User user) {
        return iUserDao.add(user);
    }

    public User getById(Long id) {
        return iUserDao.getById(id);
    }

    public boolean delete(Long id) {
        return iUserDao.delete(id);
    }
}
