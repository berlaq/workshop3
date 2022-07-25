package core.concretes;

import core.abstracts.SmsService;

public class SmsManager implements SmsService {
    @Override
    public void sendNotification() {
        System.out.println("sms gönderildi!!!");
    }
}
