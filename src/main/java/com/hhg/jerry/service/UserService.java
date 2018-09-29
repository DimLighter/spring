package com.hhg.jerry.service;

import com.hhg.jerry.bean.User;

/**
 * Created by lining on 2018/9/11.
 */
public interface UserService {
    Long add(User user);

    User getById(Long id);

    boolean delete(Long id);
}
