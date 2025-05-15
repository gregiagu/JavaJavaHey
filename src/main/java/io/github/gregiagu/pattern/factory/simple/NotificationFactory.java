package io.github.gregiagu.pattern.factory.simple;

import java.security.InvalidAlgorithmParameterException;

public class NotificationFactory {

    public static NotificationType create(NotificationEnum type) throws InvalidAlgorithmParameterException {
        switch (type) {
            case SMS:
                return new SmsNotification();
            
            case EMAIL:
                return new EmailNotification();

            case CHAT:
                return new ChatNotification();
        
            default:
                throw new InvalidAlgorithmParameterException("Wrong Type.");
        }
    }
}
