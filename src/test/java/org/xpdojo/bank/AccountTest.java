package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
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
        account.deposit(100);
        assertEquals(account.balance, 100);

    }
}
