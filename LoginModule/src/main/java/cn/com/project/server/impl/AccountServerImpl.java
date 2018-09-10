package cn.com.project.server.impl;

import cn.com.project.mapper.AccountMapper;
import cn.com.project.mapper.UserMapper;
import cn.com.project.model.Account;
import cn.com.project.model.User;
import cn.com.project.server.AccountServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServerImpl implements AccountServer {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertAccount(Account account, User user) {
        try {
            userMapper.insertUser(user);
            account.setUserId(user.getUserId());
            accountMapper.insertAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean loginCheck(Account checkAccount) {
    	try{
    		Account account = accountMapper.selectAccountByName(checkAccount.getLoginName());
            if(checkAccount.getLoginPasswd().equals(account.getLoginPasswd())) {
                return true;
            }
            return false;
    	}catch(Exception e){
    		return false;
    	}
        
    }
}
