package org.lzq.bank7;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class CustomerReport {

    public void generateReport(){
        Bank bank = Bank.getBank();
        Customer customer = null;

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