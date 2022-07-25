package business.abstracts;

import Entities.concretes.User;
import core.abstracts.NotificationService;

import java.util.List;

public interface UserService {
    void add();
    void forgotPassword(User user);
    void register(User user);
    void addNotificationTypes(User user,List<NotificationService> notificationServiceList);

}
