package cn.com.project.controller;

import cn.com.project.model.Account;
import cn.com.project.model.User;
import cn.com.project.server.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class registerController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping(value = "/register" )
    public String register(User user, Account account){
        accountServer.insertAccount(account, user);
        return "../index";
    }
}
