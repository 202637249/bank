package org.lzq.bank5_2;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class CheckingAccount extends Account {

    private SavingAccount protectedBy;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    public CheckingAccount(double init_balance, SavingAccount protectedBy) {
        super(init_balance);
        this.protectedBy = protectedBy;
    }

    public boolean withdraw(double amt){

        if(balance >= amt){
            balance -= amt;
        }else{
            if( protectedBy != null && protectedBy.getBalance() >= (amt - balance)){
                protectedBy.withdraw(amt -balance);
                balance = 0;
            }else{
                return false;
            }
        }
            return  true;
    }
}
