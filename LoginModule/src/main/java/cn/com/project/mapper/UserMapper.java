package cn.com.project.mapper;

import cn.com.project.model.User;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public interface UserMapper {

    List<User> selectUserList(@Param("currentIndex")int currentIndex, @Param("pageSize") int pageSize) throws IOException;

    User selectUserById(Integer userId) throws IOException;

    /*
    * @Description: 插入用户信息
    * @param :  [user]
    * @return : Integer
    */
    Integer insertUser(User user) throws IOException;

    Integer selectUserCount() throws IOException;

}
