package com.gaoyang.psbizweb.controller;


import com.gaoyang.cbasecore.model.User;
import com.gaoyang.psbizweb.service.impl.GetUserImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserController {
  @Autowired
    GetUserImp getUserImp;

    @RequestMapping("/getUser")
    public User getUser(){
        return getUserImp.getUser();

    }
}
