package org.lzq.bank4;

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

    public  boolean deposit(double amt){
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt){
        if(balance > amt) {
            balance -= amt;
            return  true;
        }else{
            return  false;
        }
    }
}
