package org.lzq.bank6;


/**
 * Created by lzq on 2016/11/3 0003.
 */
public class SavingAccount extends Account {

    private double interest_rate;

    public SavingAccount(double init_balance) {
        super(init_balance);
    }

    public SavingAccount(double init_balance, double interest_rate) {
        super(init_balance);
        this.interest_rate = interest_rate;
    }


}
