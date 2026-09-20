package org.example.final_test.notification;

import org.example.final_test.billing.BillingHelper;

public class NotificationService {

    private final BillingHelper billingHelper;

    public NotificationService(BillingHelper billingHelper) {
        this.billingHelper = billingHelper;
    }

    public void sendNotification() {
        billingHelper.help();
    }
}