package org.lzq.bank1.test;

import org.lzq.bank1.Account;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class TestBanking {


    public static void main(String [] args){

        // Create an account that can has a 500.00 balance.
        System.out.println("Creating an account with a 500.00 balance.");

        Account account = new Account(500.00);

        System.out.println("Withdraw 150.00");
        account.withdraw(150);
//        System.out.println(account.getBalance());
        System.out.println("Deposit 22.50");
        account.deposit(22.5);
//        System.out.println(account.getBalance());
        System.out.println("Withdraw 47.62");
        account.withdraw(47.62);
//        System.out.println(account.getBalance());
        System.out.println("The account has a balance of " + account.getBalance());
    }
}
