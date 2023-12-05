import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.mvnpackages.services.BonusService;

public class BonusServiceTest {

    @Test
    void shouldCalculateFor() {
        BonusService service = new BonusService();

        // подготавливаем данные:;
        int income = 10_000;
        int expenses = 3_000;
        boolean threshold = true;

        // вызываем целевой метод:

        int count = service.calculate(income, expenses);
    }

}

