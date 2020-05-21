public class Application {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        NotificationPanel notificationPanel = new NotificationPanel();

        notificationPanel.addNotification(new Notification("Message","New message received from : Kusal"));
        careTaker.save(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        notificationPanel.addNotification(new Notification("Phone","You missed a call from : Kusal"));
        careTaker.save(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        notificationPanel.addNotification(new Notification("Youtube","Codelabs released new video"));
        careTaker.save(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        notificationPanel.addNotification(new Notification("Instagram","__kavi.98 liked your photo"));
        careTaker.save(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        careTaker.revert(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        careTaker.revert(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        careTaker.revert(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        careTaker.revert(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

        careTaker.revert(notificationPanel);
        System.out.println(notificationPanel);
        System.out.println("COUNT : "+ notificationPanel.getNotifications().size());
        System.out.println();

    }

}
