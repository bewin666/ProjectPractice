package cn.com.project.server.impl;

import cn.com.project.mapper.UserMapper;
import cn.com.project.model.PageContainer;
import cn.com.project.model.User;

import cn.com.project.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        User user = null;
        try {
            user = userMapper.selectUserById(userId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public PageContainer<User> getUserList(PageContainer<User> pageContainer) {
        List<User> userList = null;
        try {
            int currentIndex = pageContainer.getCurrentPageNo() * pageContainer.getPageSize();
            userList = userMapper.selectUserList(currentIndex, pageContainer.getPageSize());
            pageContainer.setList(userList);
            int recordCount = userMapper.selectUserCount();
            pageContainer.setRecordCount(recordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pageContainer;
    }
}


