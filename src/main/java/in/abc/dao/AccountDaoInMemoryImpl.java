/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Prajapati
 */
public class AccountDaoInMemoryImpl implements AccountDao {

    private Map<Long, Account> accountsMap = new HashMap<>();
    
    //Instance block
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("Raj");
        account1.setBalance(10.0);
        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Man");
        account2.setBalance(20.0);
        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(List<Account> accounts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long accountId) {
        accountsMap.remove(accountId);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }

    @Override
    public List<Account> find(List<Long> accountIds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> find(String ownerName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Account> find(boolean locked) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
