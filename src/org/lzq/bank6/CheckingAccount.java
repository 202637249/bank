package org.lzq.bank6;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class CheckingAccount extends Account {

    private double overdraftProtection;
    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    public CheckingAccount(double init_balance, double overdraftProtection) {
        super(init_balance);
        this.overdraftProtection = overdraftProtection;
    }

    public boolean withdraw(double amt){

        if(balance >= amt){
            balance -= amt;
        }else{
            if(overdraftProtection >= (balance - amt)){
                overdraftProtection -=(amt-balance);
                balance = 0;
            }else{
                return false;
            }
        }
            return  true;
    }
}
