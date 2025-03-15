package factory_method.notification;

public class FacebookNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Facebook Notification");
    }

}
