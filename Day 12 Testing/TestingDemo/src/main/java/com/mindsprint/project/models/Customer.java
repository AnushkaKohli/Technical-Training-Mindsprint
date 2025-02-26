package com.mindsprint.project.models;

public class Customer {
    private int custId;
    private String name;
    private String address;

    public Customer(int custId, String name, String address) {
        this.custId = custId;
        this.name = name;
        this.address = address;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
