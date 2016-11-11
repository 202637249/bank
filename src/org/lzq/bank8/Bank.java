package org.lzq.bank8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lzq on 2016/11/3 0003.
 */
public class Bank {


    private List<Customer> customers;
//    private int numberOfCustomer;


    private  Bank(){
//        numberOfCustomer=0;
        customers =  new ArrayList<Customer>();;
    }
    private static Bank bank = new Bank();

    public static Bank getBank() {
        return bank;
    }




    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        customers.add(customer);
//        numberOfCustomer ++;
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }

    public int getNumberOfCustomer() {
//        return numberOfCustomer;\
        return customers.size();
    }

    public  Iterator<Customer> getCustomers(){

        return customers.iterator();
    }

}
