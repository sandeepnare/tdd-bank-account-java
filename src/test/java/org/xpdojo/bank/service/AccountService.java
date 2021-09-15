package org.xpdojo.bank.service;

import org.xpdojo.bank.Account;

public class AccountService {
    
    public void transfer(Account fromAccount, Account toAccount, int transferAmount) {
        fromAccount.withdraw(transferAmount);
        toAccount.deposit(transferAmount);
    }
    
}
