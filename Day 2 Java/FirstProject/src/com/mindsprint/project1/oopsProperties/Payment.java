package com.mindsprint.project1.oopsProperties;

import java.util.Scanner;

interface PaymentMethod {
    public void pay();
}

class Paypal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment done using Paypal");
    }
}
class RazorPay implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment done using RazorPay");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your payment method: ");
        String method = sc.next();
        // Because the reference object is that of the interface "PaymentMethod", only those methods written inside the interface will be accessible. Other methods written inside Paypal cannot be accessed unless they are present in the interface
        PaymentMethod pm = null;
        if (method.equals("Razorpay") || method.equals("razorpay"))
            pm = new RazorPay();
        else
            pm = new Paypal();
        pm.pay();
        // Taking the reference type of your interface and creating an object of your class can help you achieve an abstraction
    }
}
