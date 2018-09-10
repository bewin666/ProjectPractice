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
            //account.setUserId(user.getUserId());
            accountMapper.insertAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean loginCheck(Account checkAccount) {
    	System.out.println("servletimpl"+checkAccount.getAccountId());
        Account account = accountMapper.selectAccountById(checkAccount.getAccountId());
        if(account!=null) {
            return true;
        }
        return false;
    }
}
