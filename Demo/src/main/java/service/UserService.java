package service;

import model.User;

public interface UserService {
    User selectUserById(Integer userId);  
}