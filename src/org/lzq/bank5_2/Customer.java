package org.lzq.bank5_2;


/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Customer {

    private String firstName;
    private String lastName ;
    private CheckingAccount checking ;
    private SavingAccount savings;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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


    public Account getChecking() {
        return checking;
    }

    public void setChecking(CheckingAccount checking) {
        this.checking = checking;
    }

    public SavingAccount getSavings() {
        return savings;
    }

    public void setSavings(SavingAccount savings) {
        this.savings = savings;
    }
}
