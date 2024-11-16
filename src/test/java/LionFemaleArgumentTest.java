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
public class LionFemaleArgumentTest {

    @Spy
    private Lion lion = new Lion("Самка", new Feline());

    public LionFemaleArgumentTest() throws Exception {
    }

    @Test
    public void testingHaveMane() throws Exception {
        Assert.assertFalse(lion.doesHaveMane());
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
    public void testingValueTimeCallMethodGetKittens() {
        lion.getKittens();
        Mockito.verify(lion, Mockito.times(1)).getKittens();
    }
}
