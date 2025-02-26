package com.mindsprint.project.dao;

import com.mindsprint.project.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDAO {
    private List<Customer> list = null;
    public CustomerDaoImpl() {
        list = new ArrayList<>();
        list.add(new Customer(1, "Alex", "US"));
        list.add(new Customer(2, "Bob", "UK"));
        list.add(new Customer(3, "Vishwa", "India"));
    }
    @Override
    public Customer addNewCustomer(Customer customer) {
        list.add(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(int custId) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return list;
    }

    @Override
    public boolean deleteCustomer(int custId) {
        return false;
    }

    @Override
    public boolean updateCustomer(int custId, String address) {
        return false;
    }
}
