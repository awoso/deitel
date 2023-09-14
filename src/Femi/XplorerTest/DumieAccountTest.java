package Femi.XplorerTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DumieAccountTest {
    @Test
    public void testThatAccountExist(){
        //when i have an account
    Account1 myAccount = new Account1();
    assertNotNull(myAccount);
    }
    @Test
    public void testThatICanDeposit(){
        //given that i av an account
     Account1 myAccount = new Account1();
     // when i can deposit 5k
     myAccount.deposit(5000);
     //check that my balance is 5k
     int balance = myAccount.checkBalance();
//        System.out.println(balance);
     assertEquals(5000, balance);
    }
    @Test
    public void testThatICanDepositTwice(){
    //given that i have an account
     Account1 myAccount = new Account1();
     // when i can deposit 2.5k and 3.k respectively
    myAccount.deposit(2500);
    myAccount.deposit(3000);
    int balance = myAccount.checkBalance();
    assertEquals(5500,balance);
    }
    @Test
    public void testThatAccountCanWithdraw(){
        //given
     Account1 myAccount = new Account1();
     //when i can deposit 2k
     myAccount.deposit(2000);
     //when i can withdraw 1k
     myAccount.withdraw(1000);
     //check that my balance is 1k
     int balance = myAccount.checkBalance();
     assertEquals(1000, balance);
    }

}
