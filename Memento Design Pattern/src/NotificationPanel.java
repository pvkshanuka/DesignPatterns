import java.util.ArrayList;

public class NotificationPanel {

    ArrayList<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public ArrayList<Notification> getNotifications() {
        return (ArrayList<Notification>) notifications.clone();
    }

    public NotificationPanelMemento save(){
        return new NotificationPanelMemento(getNotifications());
    }

    public void revert(NotificationPanelMemento notificationPanelMemento){
        notifications = notificationPanelMemento.getNotifications();
    }

    public static class NotificationPanelMemento {

        ArrayList<Notification> notifications;

        public NotificationPanelMemento(ArrayList<Notification> notifications) {
            this.notifications = notifications;
        }

        private ArrayList<Notification> getNotifications() {
            return notifications;
        }
    }

    @Override
    public String toString() {
        return "NotificationPannel{" +
                "notifications=" + notifications +
                '}';
    }
}
