import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.service.FreelanceService;

public class FreelanceServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test_data.csv")
    public void testFreelanceServiceCalculate(int expected, int income, int expenses, int threshold) {
        FreelanceService freelanceService = new FreelanceService();
        int actual = freelanceService.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
