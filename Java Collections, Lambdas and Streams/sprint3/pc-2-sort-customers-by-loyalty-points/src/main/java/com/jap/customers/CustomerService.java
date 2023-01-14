package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){

        List<Integer> l = new ArrayList<Integer>();

        Collections.sort(customerList, loyaltyPointComparator);

        for (Customer c : customerList ) {
            l.add(c.getLoyaltyPoints());
        }

        return l;
    }

}
