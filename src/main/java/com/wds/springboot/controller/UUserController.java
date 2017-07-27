package com.wds.springboot.controller;

import com.wds.springboot.dao.UUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * Created by wuds on 2017/7/27.
 */
@RestController
@RequestMapping("/user")
public class UUserController {

    @Autowired
    private UUserDao userDao;

    @RequestMapping("/getAll")
    public void getAllUser(){
        userDao.findAll().forEach(uUser -> {
            System.out.println(uUser.getNickname());
        });
    }
}
