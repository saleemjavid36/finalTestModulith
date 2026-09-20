package org.example.final_test.payment;

import org.example.final_test.billing.BillingHelper;

public class PaymentService {

    private final BillingHelper billingHelper;

    public PaymentService(BillingHelper billingHelper) {
        this.billingHelper = billingHelper;
    }

    public void processPayment() {
        System.out.println("Payment processed");
        billingHelper.help();
    }
}