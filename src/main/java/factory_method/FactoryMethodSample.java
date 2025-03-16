package factory_method;

import factory_method.factory.FacebookNotificationFactory;
import factory_method.factory.NotificationFactory;
import factory_method.factory.SMSNotificationFactory;

import java.util.Scanner;

public class FactoryMethodSample {

    private static NotificationFactory notificationFactory = null;

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var input = scanner.next();

        switch (input) {
            case "sms" -> notificationFactory = new SMSNotificationFactory();
            case "facebook" -> notificationFactory = new FacebookNotificationFactory();
            default -> throw new IllegalArgumentException("Invalid input");
        }

        var notification = notificationFactory.createNotification();
        notification.notifyUser();

    }

}
