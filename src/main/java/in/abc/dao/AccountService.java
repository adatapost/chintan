/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abc.dao;

/**
 *
 * @author Prajapati
 */
public interface AccountService {

    public void transferMoney(
            long sourceAccountId, long targetAccountId, double amount);

    public void depositMoney(long accountId, double amount) throws Exception;

    public Account getAccount(long accountId);
}
