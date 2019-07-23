package com.gaoyang.psbizweb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoyang.cbasecore.model.User;
import com.gaoyang.web.service.GetUserService;
import org.springframework.stereotype.Service;

@Service
public class GetUserImp {

    @Reference
    GetUserService getUserService;
 public User getUser(){
     User user=new User();
     return getUserService.getInfo("hh");
 }




}
