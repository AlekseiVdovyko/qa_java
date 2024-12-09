import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void testingMakeSoundAnimal() {
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals("Ошибка в издаваемом звуке животным", expected, actual);
    }

    @Test
    public void testingFoodAnimal() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        Assert.assertEquals("Ошибка в названии животных", expected, actual);
    }
}
