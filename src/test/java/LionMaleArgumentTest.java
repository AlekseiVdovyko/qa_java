import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMaleArgumentTest {

    @Spy
    private Lion lion = new Lion("Самец", new Feline());

    public LionMaleArgumentTest() throws Exception {
    }

    @Test
    public void testingHaveMane() throws Exception {
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void getValueKittensWithParameterPositiveTest() {
        Assert.assertEquals("Неправильное количество", 1, lion.getKittens());
    }

    @Test
    public void getValueKittensWithParameterNegativeTest() {
        Assert.assertNotEquals("Неправильное количество", 2, lion.getKittens());
    }

    @Test
    public void testingFoodOfLine() throws Exception {
        List<String> actual = new ArrayList<>();
        actual.add("Животные");
        actual.add("Птицы");
        actual.add("Рыба");
        List<String> expected = lion.getFood();
        Assert.assertEquals("Ошибка в названии животных", expected, actual);
    }

    @Test
    public void lionWrongConstructorArgumentTest() {
        Assert.assertThrows("Вызов должен вызвать исключение Exception", Exception.class, () -> new Lion("Wrong argument", new Feline()));
    }

    @Test
    public void testingValueTimeCallMethodGetFood() throws Exception {
        lion.getFood();
        lion.getFood();
        Mockito.verify(lion, Mockito.times(2)).getFood();
    }
}
