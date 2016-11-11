package org.lzq.bank6.test;/*
 * This class creates the program to test the banking classes.
 * It creates a set of customers, with a few accounts each,
 * and generates a report of current account balances.
 */

import org.lzq.bank6.*;

public class TestBanking {

    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Customer customer;
        CustomerReport report = new CustomerReport();

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
        report.generateReport();
    }
}
