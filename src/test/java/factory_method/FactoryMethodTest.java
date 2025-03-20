package factory_method;

import factory_method.factory.FacebookNotificationFactory;
import factory_method.factory.NotificationFactory;
import factory_method.factory.SMSNotificationFactory;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

class FactoryMethodTest {

    @Test
    void test() {
        var scanner = new Scanner(System.in);
        var input = scanner.next().toLowerCase();

        NotificationFactory notificationFactory = switch (input) {
            case "sms" -> new SMSNotificationFactory();
            case "facebook" -> new FacebookNotificationFactory();
            default -> throw new IllegalArgumentException("Invalid input");
        };

        var notification = notificationFactory.createNotification();
        notification.notifyUser();
    }

}
