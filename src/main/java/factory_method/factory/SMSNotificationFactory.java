package factory_method.factory;

import factory_method.notification.Notification;
import factory_method.notification.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
