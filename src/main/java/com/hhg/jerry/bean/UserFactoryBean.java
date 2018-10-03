package com.hhg.jerry.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by lina on 2018/10/3.
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User u = new User();
        u.setId(111L);
        u.setName("ted");
        u.setJob("c++");
        return u;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
