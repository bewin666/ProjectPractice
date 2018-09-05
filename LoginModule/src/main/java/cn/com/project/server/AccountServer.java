package cn.com.project.server;

import cn.com.project.model.Account;
import cn.com.project.model.User;


public interface AccountServer {
    /*
    * @Description:
    * @param :  [account, user]
    * @return : void
    */
    void insertAccount(Account account, User user);

    Boolean loginCheck(Account account);

}
