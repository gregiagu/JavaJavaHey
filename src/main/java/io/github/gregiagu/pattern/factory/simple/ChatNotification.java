package io.github.gregiagu.pattern.factory.simple;

public class ChatNotification
implements NotificationType {

    @Override
    public Boolean send() {
        return true;
    }

}
