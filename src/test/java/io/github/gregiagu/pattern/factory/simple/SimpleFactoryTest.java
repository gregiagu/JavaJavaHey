package io.github.gregiagu.pattern.factory.simple;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.InvalidAlgorithmParameterException;

import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    void createSmsNotificationTest() throws InvalidAlgorithmParameterException {
        NotificationType nt = NotificationFactory.create(NotificationEnum.SMS);
        assertThat(nt.send()).isTrue();
    }

    @Test
    void createEmailNotificationTest() throws InvalidAlgorithmParameterException {
        NotificationType nt = NotificationFactory.create(NotificationEnum.EMAIL);
        assertThat(nt.send()).isTrue();
    }

    @Test
    void createChatNotificationTest() throws InvalidAlgorithmParameterException {
        NotificationType nt = NotificationFactory.create(NotificationEnum.CHAT);
        assertThat(nt.send()).isTrue();
    }    
}
