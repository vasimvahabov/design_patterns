package factory_method;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete Product : EmailNotificationService
 * */

@Log4j2
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String recipient, String message) {
        log.info("Sending Email Notification to {} : {}", recipient, message);
    }

}
