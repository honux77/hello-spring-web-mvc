package honux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class HelloTest {
    @Test
    @DisplayName("Junit, AssertJ 정상동작 확인")
    void hello() {
        assertThat(new HelloApplication()).isNotNull();
    }
}
