package cn.com.project.server;

import cn.com.project.model.PageContainer;
import cn.com.project.model.User;

import java.util.List;


public interface UserServer {

    User getUserById(Integer userId);

    PageContainer<User> getUserList(PageContainer<User> pageContainer);

}
