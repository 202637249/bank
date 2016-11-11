package org.lzq.bank7;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Account {

    protected  double balance;

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

    public void withdraw(double amt){
        if(balance < amt) {
          throw  new OverdraftException("资金不足 ",(amt - balance));
        }
        balance -= amt;
    }
}
