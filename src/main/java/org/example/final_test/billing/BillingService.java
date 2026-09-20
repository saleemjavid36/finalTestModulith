package org.example.final_test.billing;

import org.example.final_test.payment.api.PaymentApiService;

public class BillingService {

    private final PaymentApiService paymentApiService;

    public BillingService(PaymentApiService paymentApiService) {
        this.paymentApiService = paymentApiService;
    }

    public void bill() {
        paymentApiService.processPayment();
    }
}