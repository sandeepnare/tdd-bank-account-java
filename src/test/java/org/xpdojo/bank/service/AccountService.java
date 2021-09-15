package org.xpdojo.bank.service;

import org.xpdojo.bank.Account;

public class AccountService {

    public void deposit(Account account, int i) {
        account.balance += i;
    }

    public void withdraw(Account account, int i) {
        account.balance -= i;
    }
    public void transfer(Account fromAccount, Account toAccount, int transferAmount) {
        withdraw(fromAccount, transferAmount);
        deposit(toAccount, transferAmount);
    }
    
}
