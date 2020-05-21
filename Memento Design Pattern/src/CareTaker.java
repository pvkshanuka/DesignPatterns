import java.util.Stack;

public class CareTaker {

    Stack<NotificationPanel.NotificationPanelMemento> notificationHistory = new Stack<>();

    public void save(NotificationPanel notificationPanel){
        notificationHistory.push(notificationPanel.save());
    }

    public void revert(NotificationPanel notificationPanel){
        System.out.println("Undo");
        if (!notificationHistory.isEmpty())
            notificationPanel.revert(notificationHistory.pop());
        else
            System.out.println("Cannot Undo.!");
    }

}
