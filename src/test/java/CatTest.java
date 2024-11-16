import com.example.Cat;
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
public class CatTest {

    @Spy
    private Cat cat = new Cat(new Feline());

    @Test
    public void testingMakeSoundAnimal() {
        Assert.assertEquals("Возвращен неверный результат", "Мяу", cat.getSound());
    }

    @Test
    public void testingFoodAnimal() throws Exception {
        List<String> actual = new ArrayList<>();
        actual.add("Животные");
        actual.add("Птицы");
        actual.add("Рыба");
        List<String> expected = cat.getFood();
        Assert.assertEquals("Ошибка в названии животных", expected, actual);
    }

    @Test
    public void testingValueTimeCallMethodGetFood() throws Exception {
        cat.getFood();
        Mockito.verify(cat, Mockito.times(1)).getFood();
    }
}
