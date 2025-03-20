package factory_method;

/**
 * Factory (creator) : BaseNotificationFactory
 * */

public interface BaseNotificationFactory {

    NotificationService notificationService(NotificationType notificationType);

}
