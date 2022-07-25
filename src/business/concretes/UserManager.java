package business.concretes;

import Entities.concretes.User;
import business.abstracts.UserService;
import core.abstracts.NotificationService;
import core.concretes.EmailManager;
import core.concretes.SmsManager;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {

    List<NotificationService> notificationServices;
    List<User> users = new ArrayList<User>();


    @Override
    public void add() {

    }

    @Override
    public void forgotPassword(User user) {
      List<NotificationService> tempNotificationTypes =  user.getNotificationTypes();
        for (NotificationService notificationService: tempNotificationTypes) {
            notificationService.sendNotification();
        }
    }

    @Override
    public void register(User user) {

        //validation
        for (NotificationService notificationService:user.getNotificationTypes()) {
            notificationService.sendNotification();
        }
        System.out.println("veritabanına kaydedildi");
    }

    @Override
    public void addNotificationTypes(User user, List<NotificationService> notificationServiceList) {

        //kullanıcı seçenekleri işaretledi ve sonuç olarak bir liste döndü.
        user.setNotificationTypes(notificationServiceList);
        System.out.println("bildirim tipi eklendi");
    }


}
