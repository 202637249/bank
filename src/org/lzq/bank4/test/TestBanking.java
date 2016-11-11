package org.lzq.bank4.test;

import org.lzq.bank4.Bank;
import org.lzq.bank4.Customer;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class TestBanking {


    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add Customer Jane, Simms
        bank.addCustomer("Jane","Jane");
        //code
        //Add Customer Owen, Bryant
        //code
        bank.addCustomer("Owen","Bryant");
        // Add Customer Tim, Soley
        //code
        bank.addCustomer("Tim","Soley");
        // Add Customer Maria, Soley
        //code
        bank.addCustomer("Maria","Soley");
        for ( int i = 0; i < bank.getNumberOfCustomer(); i++ ) {
            Customer customer = bank.getCustomers(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
