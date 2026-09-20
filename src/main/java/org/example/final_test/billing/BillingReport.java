package org.example.final_test.billing;

import org.example.final_test.payment.api.PaymentApiService;

public class BillingReport {

    public void generate(PaymentApiService paymentApiService) {
        paymentApiService.processPayment();
    }
}