import Entities.concretes.User;
import business.concretes.UserManager;
import core.abstracts.NotificationService;
import core.concretes.EmailManager;
import core.concretes.SmsManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NotificationService eMailNotification = new EmailManager();
        NotificationService smsNotification = new SmsManager();
        List<NotificationService> notificationTypes = new ArrayList<NotificationService>();
        notificationTypes.add(new SmsManager());
        notificationTypes.add(new EmailManager());


        User user1 = new User(1,"ali","veli","aliveli@xx.com","123","ali06");
        UserManager userManager1 = new UserManager();

        userManager1.addNotificationTypes(user1,notificationTypes);
        userManager1.register(user1);

    }
}