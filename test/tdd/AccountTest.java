package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {



    @Test
    public void testDeposit() {
        //given that i have account
        Account awosoAccount = new Account();
        //when i deposit 5k
        awosoAccount.deposit(5000);
        //check my balance is 5k
        int balance = awosoAccount.checkBalance();
        assertEquals(5000, balance);
    }
@Test
    public void depositTwice(){
        //given that I have account
        Account awosoAccount = new Account();
        //when i have 5k
        awosoAccount.deposit(5000);
        awosoAccount.deposit(5000);
        //check my balance is 10k
      //  int balance = awosoAccount.checkBalance();
        assertEquals(10000,awosoAccount.checkBalance());
    }


    }




