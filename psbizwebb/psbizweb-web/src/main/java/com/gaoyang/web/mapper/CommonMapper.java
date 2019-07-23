package com.gaoyang.web.mapper;

import com.gaoyang.cbasecore.model.User;



public interface CommonMapper {

    /**
     * @访问缓存
     *
     */
     public User getUser(String userName);

}
