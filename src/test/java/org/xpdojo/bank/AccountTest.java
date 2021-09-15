package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.bank.service.AccountService;

import static org.hamcrest.Matchers.is;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void startingBalanceIsZero() {
        final Account account = new Account();
        assertEquals(account.balance, 0);

    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        final Account account = new Account();
        final AccountService accountService = new AccountService();
        accountService.deposit(account, 100);
        assertEquals(account.balance, 100);

    }

    @Test
    public void withdrawAnAmountToReduceTheBalance() {
        final Account account = new Account();
        final AccountService accountService = new AccountService();
        accountService.deposit(account, 100);
        accountService.withdraw(account, 50);
        assertEquals(account.balance, 50);
    }

    @Test
    public void transferBetweenAccounts() {
        final Account accountA = new Account();
        final Account accountB = new Account();
        final AccountService accountService = new AccountService();
        accountService.deposit(accountA, 100);
        accountService.transfer(accountA, accountB, 10);
        assertEquals(accountA.balance, 90);
        assertEquals(accountB.balance, 10);
    }
}
