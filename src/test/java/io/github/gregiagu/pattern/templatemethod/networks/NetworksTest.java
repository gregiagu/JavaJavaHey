package io.github.gregiagu.pattern.templatemethod.networks;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class NetworksTest {

    @Test
    void messageOnFacebookTest() {
        Network net = new Facebook();
        assertThat(net.post("Mensagem para postar no Facebook.")).isTrue();
    }

    @Test
    void messageOnTwitterTest() {
        Network net = new Twitter();
        assertThat(net.post("Mensagem para postar no Twitter.")).isTrue();
    }
}
