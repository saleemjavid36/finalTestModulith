package org.example.final_test.notification;

import org.example.final_test.payment.api.PaymentApiService;

public class NotificationReport {

    private final PaymentApiService paymentApiService;

    public NotificationReport(PaymentApiService paymentApiService) {
        this.paymentApiService = paymentApiService;
    }
}