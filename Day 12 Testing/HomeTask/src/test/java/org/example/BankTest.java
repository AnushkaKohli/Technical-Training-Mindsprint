package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
    private SavingAcc savingAcc;
    private CurrentAcc currentAcc;

    @BeforeEach
    public void setUp() {
        savingAcc = new SavingAcc(5.0); // Assuming 5% interest rate
        savingAcc.setBalance(1000); // Initial balance
        currentAcc = new CurrentAcc(500); // Assuming overdraft limit of 500
        currentAcc.setBalance(1000); // Initial balance
    }

    @AfterEach
    public void tearDown() {
        savingAcc = null;
        currentAcc = null;
    }

    @Test
    public void testDeposit() {
        savingAcc.deposit(200);
        Assertions.assertEquals(1200, savingAcc.getBalance()); // Assuming deposit of 100
    }

    @Test
    public void testWithdrawal() {
        savingAcc.withdrawal(100);
        Assertions.assertEquals(900, savingAcc.getBalance()); // Assuming withdrawal of 100
    }

    @Test
    public void testAddInterest() {
        savingAcc.addInterest();
        Assertions.assertEquals(1050, savingAcc.getBalance()); // 5% interest on 1000
    }

    @Test
    public void testOverdraftWithdrawal() {
        currentAcc.withdrawal(1200);
        Assertions.assertEquals(-200, currentAcc.getBalance()); // Assuming withdrawal of 1500
    }

    @Test
    public void testOverdraftLimitExceeded() {
        currentAcc.withdrawal(2000);
        Assertions.assertEquals(1000, currentAcc.getBalance()); // Assuming withdrawal of 2000 fails
    }
}
