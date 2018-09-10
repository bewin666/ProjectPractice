package cn.com.project.controller;

import cn.com.project.model.User;
import cn.com.project.model.Account;
import cn.com.project.server.AccountServer;
import cn.com.project.server.UserServer;

import java.net.PasswordAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.Response;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(Account account) {   	
    	//System.out.println(user.getUserId()+"---"+user.getPassword());
    	/*String PWD = "";
    	try{
    		PWD = account.getUserById(user.getUserId()).getPassword();
    		System.out.println(PWD);
    	}catch(Exception e){
    		System.out.println("Exception!");
    	}*/
    	boolean index = accountServer.loginCheck(account);
    	if(index == true){
    		return "redirect: ../index.jsp";
    	} else{
    		return "redirect: ../error.jsp";
    	}
    	
    	
    }

    

}
