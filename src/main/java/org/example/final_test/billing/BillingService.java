package org.example.final_test.billing;

import org.example.final_test.payment.PaymentService;

public class BillingService {

    private final PaymentService paymentService;

    public BillingService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void bill() {
        paymentService.processPayment();
    }
}