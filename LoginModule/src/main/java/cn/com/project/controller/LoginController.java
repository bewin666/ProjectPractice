package cn.com.project.controller;

import cn.com.project.model.Account;
import cn.com.project.server.AccountServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/login")
    public String login(Account account) {
        boolean loginResult = accountServer.loginCheck(account);
        if(loginResult) {
            return "redirect: ../user_list.jsp";
        }
        return "redirect: error.jsp";
    }



}
