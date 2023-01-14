package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
        NameComparator nameComparator = new NameComparator();
        Collections.sort(customerList, nameComparator);
        List<String> l = new ArrayList<String>();
        for (Customer c: customerList) {
            l.add(c.getCustomerName());
        }

        return l;
    }


}
