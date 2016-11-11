package org.lzq.bank5_1;


/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Customer {

    private String firstName;
    private String lastName ;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new Account[2];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void addAccount(Account account) {
        accounts[numberOfAccounts++] =account;
    }
    public Account getAccount(int index){
        return accounts[index];
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
