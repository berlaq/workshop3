package core.concretes;

import core.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public void sendNotification() {
        System.out.println("mail gönderildi!!!");
    }
}
