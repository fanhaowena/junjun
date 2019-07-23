package com.gaoyang.web.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoyang.cbasecore.api.Api;
import com.gaoyang.cbasecore.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class GetUserService implements  Api{
        @Autowired
    private static final Logger LOGGER = LoggerFactory.getLogger(GetUserService.class);


    @Override
    public User getInfo(String username) {
      User user=new User(username,"7634523","sakura");

         return user ;
    }
    @Override
    public int addUser(User user) {
        return 0;
    }
}
