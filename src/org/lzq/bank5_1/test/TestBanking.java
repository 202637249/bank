package org.lzq.bank5_1.test;/*
 * This class creates the program to test the banking classes.
 * It creates a set of customers, with a few accounts each,
 * and generates a report of current account balances.
 */

import org.lzq.bank5_1.*;

import java.text.NumberFormat;

public class TestBanking {

    public static void main(String[] args) {
        NumberFormat currency_format = NumberFormat.getCurrencyInstance();
        Bank bank = new Bank();
        Customer customer;

        // Create several customers and their accounts
        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomers(0);
        customer.addAccount(new SavingAccount(500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomers(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomers(2);
        customer.addAccount(new SavingAccount(1500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomers(3);
        // Maria and Tim have a shared checking account
        customer.addAccount(bank.getCustomers(2).getAccount(1));
        customer.addAccount(new SavingAccount(150.00, 0.05));

        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for (int cust_idx = 0; cust_idx < bank.getNumberOfCustomer(); cust_idx++) {
            customer = bank.getCustomers(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for (int acct_idx = 0; acct_idx < customer.getNumberOfAccounts(); acct_idx++) {
                Account account = customer.getAccount(acct_idx);
                String account_type = "";

                // Determine the account type
                /*** Step 1:
                 **** Use the instanceof operator to test what type of account
                 **** we have and set account_type to an appropriate value, such
                 **** as "Savings Account" or "Checking Account".
                 ***/
                if (account instanceof SavingAccount) {
                    account_type = "Saving Account";
                } else if (account instanceof CheckingAccount) {
                    account_type = "Cheking Account";
                }
                // Print the current balance of the account
                /*** Step 2:
                 **** Print out the type of account and the balance.
                 **** Feel free to use the currency_format formatter
                 **** to generate a "currency string" for the balance.
                 ***/
            System.out.println(account_type +":current balance is ￥"+ account.getBalance());
            }
        }
    }
}
