package org.lzq.bank7;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class CheckingAccount extends Account {

    private double overdraftProtection = -1;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    public CheckingAccount(double init_balance, double overdraftProtection) {
        super(init_balance);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double amt){

        if(balance >= amt){
            balance -= amt;


        }else{
            if(overdraftProtection == -1){
                throw  new OverdraftException("no overdraft protection", (amt - balance));
            }

            if(overdraftProtection >= (amt  - balance)){
                overdraftProtection -=(amt-balance);
                balance = 0;
            }else{
                throw  new OverdraftException("Insufficient funds for overdraft protection", (amt - balance));
            }
        }
    }
}
