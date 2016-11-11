package org.lzq.bank5_1;


/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Bank {

    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        numberOfCustomer=0;
        customers =  new Customer[50];
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer ++;
    }

    public Customer getCustomers(int index) {
        return customers[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

}
