package factory_method;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete Product : FacebookNotificationService
 * */

@Log4j2
public class FacebookNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        log.info("Sending Facebook Notification to {} : {}", recipient, message);
    }

}
