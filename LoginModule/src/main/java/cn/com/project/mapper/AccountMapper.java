package cn.com.project.mapper;

import cn.com.project.model.Account;

public interface AccountMapper {

    /*
    * @Description:添加账户
    * @param :  [account]
    * @return : void
    */
    void insertAccount(Account account);

    Account selectAccountById(Integer accountId);

}
