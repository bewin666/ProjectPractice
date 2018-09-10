package cn.com.project.controller;

import cn.com.project.model.User;
import cn.com.project.server.AccountServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/login.do")
    public String login(User user) {
    	if(user == null){
    		System.out.println("user is null.");
    	} else {
    		System.out.println(user.toString());
    	}
        
        return "error";
    }

    

}
