package factory_method.factory;

import factory_method.notification.FacebookNotification;
import factory_method.notification.Notification;

public class FacebookNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new FacebookNotification();
    }

}
