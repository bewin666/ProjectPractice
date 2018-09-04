package dao;

import model.User;

public interface UserDao {
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);
    
}