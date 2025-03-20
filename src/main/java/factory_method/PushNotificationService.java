package factory_method;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete Product : PushNotificationService
 * */

@Log4j2
public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        log.info("Sending Push Notification to {} : {}", recipient, message);
    }

}
