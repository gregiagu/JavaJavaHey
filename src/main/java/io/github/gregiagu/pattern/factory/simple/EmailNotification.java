package io.github.gregiagu.pattern.factory.simple;

public class EmailNotification
implements NotificationType {

    @Override
    public Boolean send() {
        return true;
    }

}
