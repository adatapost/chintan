/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abc.dao;

import java.util.List;

/**
 *
 * @author Prajapati
 */
public interface AccountDao {

    public void insert(Account account);

    public void update(Account account);

    public void update(List<Account> accounts);

    public void delete(long accountId);

    public Account find(long accountId);

    public List<Account> find(List<Long> accountIds);

    public List<Account> find(String ownerName);

    public List<Account> find(boolean locked);

}
