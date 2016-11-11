package org.lzq.bank2;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Account {

    private double balance;

    public Account (double init_balance){
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public  void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        balance -= amt;
    }
}
