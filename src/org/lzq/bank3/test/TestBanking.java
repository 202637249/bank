package org.lzq.bank3.test;

import org.lzq.bank3.Account;
import org.lzq.bank3.Customer;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class TestBanking {


    public static void main(String [] args){

        // Creating the customer Jane Smith
        System.out.println("Creating the customer Jane Smith");

        Customer customer = new Customer("Jane","Smith");
        //Creating her account with a 500.00 balance.
        customer.setAccount( new Account(500.00));

        System.out.println("Withdraw 150.00:"+ customer.getAccount().withdraw(150));
        System.out.println("Deposit 22.50:"+customer.getAccount().deposit(22.5));
        System.out.println("Withdraw 47.62:"+customer.getAccount().withdraw(47.62));
        System.out.println("Withdraw 400.00:"+customer.getAccount().withdraw(400.00));
//        System.out.println(account.getBalance());
        //Customer [Smith, Jane] has a balance of 324.88
        System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+"] has a balance of " + customer.getAccount().getBalance());
    }
}
