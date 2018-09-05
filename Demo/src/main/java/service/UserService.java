package service;

import model.User;

public interface UserService {
    User selectUserById(String userId);  
}