package org.example.final_test.notification;

import org.example.final_test.billing.BillingService;

public class NotificationReport {

    private final BillingService billingService;

    public NotificationReport(BillingService billingService) {
        this.billingService = billingService;
    }

    public void sendNotification() {
        System.out.println("Notification sent");
    }
}