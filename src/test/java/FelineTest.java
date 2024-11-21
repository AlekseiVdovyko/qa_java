import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private Feline feline = new Feline();

    @Test
    public void getListEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals("Ошибка с вписке животных", expected, actual);
    }

    @Test
    public void getFoodFelineTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.getFood("Хищник");
        Assert.assertEquals("Ошибка с вписке животных", expected, actual);
    }

    @Test
    public void getFamilyAnimals() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals("Возвращен неверный результат", expected, actual);
    }

    @Test
    public void getValueKittensWithoutParameter() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals("Неправильное количество", expected, actual);
    }

    @Test
    public void getValueKittensWithParameterPositiveTest() {
        int expected = 1;
        int actual = feline.getKittens(1);
        Assert.assertEquals("Неправильное количество", expected, actual);
    }
}