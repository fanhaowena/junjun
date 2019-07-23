package com.gaoyang.cbasecore.api;

import com.gaoyang.cbasecore.model.User;

public interface Api {
    public User getInfo(String username);
    public  int  addUser(User user);
}
