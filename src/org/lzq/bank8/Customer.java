package org.lzq.bank8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Customer {

    private String firstName;
    private String lastName ;
    private List<Account> accounts;
//    private int numberOfAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new ArrayList<Account>();
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
        accounts.add(account);
    }

    public Account getAccount(int index){
        return accounts.get(index);
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public Iterator<Account> Accounts(){

        return accounts.iterator();
    }
}
