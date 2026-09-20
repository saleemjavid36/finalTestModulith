package org.example.final_test.payment;

import org.example.final_test.notification.NotificationReport;

public class PaymentService {

    private final NotificationReport notificationReport;

    public PaymentService(NotificationReport notificationReport) {
        this.notificationReport = notificationReport;
    }

    public void processPayment() {
        notificationReport.sendNotification();
    }
}