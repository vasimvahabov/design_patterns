package factory_method;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import java.util.Objects;

/**
 * Concrete Factory (creator) : NotificationFactory
 * */

@Log4j2
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NotificationFactory implements BaseNotificationFactory{

    static NotificationFactory NOTIFICATION_FACTORY;

    public static NotificationFactory notificationFactory() {
        if (Objects.isNull(NOTIFICATION_FACTORY)) {
            synchronized (NotificationFactory.class) {
                NOTIFICATION_FACTORY =  new NotificationFactory();
            }
        }
        return NOTIFICATION_FACTORY;
    }

    @Override
    public NotificationService notificationService(@NonNull NotificationType notificationType) {
        return switch (notificationType) {
            case FACEBOOK -> new FacebookNotificationService();
            case PUSH -> new PushNotificationService();
            case EMAIL -> new EmailNotificationService();
            case SMS -> new SMSNotificationService();
            case NONE -> throw new IllegalArgumentException("Invalid notification type");
        };
    }

}
