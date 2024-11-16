import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void getFamilyAnimals() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals("Возвращен неверный результат", expected, actual);
    }

    @Test
    public void getValueKittensWithoutParameter() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getValueKittensWithParameterPositiveTest() {
        Assert.assertEquals("Неправильное количество кошачьих", 1, feline.getKittens(1));
    }

    @Test
    public void getValueKittensWithParameterNegativeTest() {
        Assert.assertNotEquals("Неправильное количество кошачьих", 2, feline.getKittens(1));
    }

    @Test
    public void getListPredatorAnimals() throws Exception {
        List<String> actual = new ArrayList<>();
        actual.add("Животные");
        actual.add("Птицы");
        actual.add("Рыба");
        List<String> expected = feline.eatMeat();
        Assert.assertEquals("Ошибка в названии животных", expected, actual);
    }

    @Test
    public void testingValueTimeCallMethodGetKittens() throws Exception {
        feline.getKittens();
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(2)).getKittens();
    }

    @Test
    public void testingValueTimeCallMethodEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}