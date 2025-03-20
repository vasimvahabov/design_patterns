package factory_method;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class FactoryMethodTest {

    @Test
    void test() {
        BaseNotificationFactory baseNotificationFactory = NotificationFactory.notificationFactory();

        var facebookNotificationService = baseNotificationFactory.notificationService(NotificationType.FACEBOOK);
        facebookNotificationService.sendNotification("john@example.com", "Your order is confirmed!");

        var emailNotificationService = baseNotificationFactory.notificationService(NotificationType.EMAIL);
        emailNotificationService.sendNotification("duke@example.com", "Your order is confirmed!");

        var pushNotificationService = baseNotificationFactory.notificationService(NotificationType.PUSH);
        pushNotificationService.sendNotification("mike@example.com", "Your order is confirmed!");

        var smsNotificationService = baseNotificationFactory.notificationService(NotificationType.SMS);
        smsNotificationService.sendNotification("mike@example.com", "Your order is confirmed!");

        assertThrows(IllegalArgumentException.class, () -> baseNotificationFactory.notificationService(NotificationType.NONE));
    }

}
