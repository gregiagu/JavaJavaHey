package io.github.gregiagu.pattern.factory.simple;

public class SmsNotification
implements NotificationType {

    @Override
    public Boolean send() {
        return true;
    }

}
