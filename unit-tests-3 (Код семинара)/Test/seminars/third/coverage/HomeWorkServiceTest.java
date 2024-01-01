package seminars.third.coverage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
class HomeWorkServiceTest {
    private HomeWorkService homeWorkService;

    @BeforeEach
    void setUp() {
        homeWorkService = new HomeWorkService();
    }
    // Задание 1
    @Test
    void numberInIntervalTest() {
        String res = homeWorkService.numberInInterval(27);

        assertThat(res).isEqualTo("in interval");
    }
    // Задание 2
    @Test
    void numberParityTestYes() {
        String res = homeWorkService.numberParity(2);

        assertThat(res).isEqualTo("Parity");
    }
    @Test
    void numberParityTestNo() {
        String res = homeWorkService.numberParity(3);

        assertThat(res).isEqualTo("not Parity");
    }
}
