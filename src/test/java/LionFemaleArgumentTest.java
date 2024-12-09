import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionFemaleArgumentTest {

    @Mock
    private Feline feline;

    @Test
    public void testingGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals("Неправильное количество", expected, actual);
    }

    @Test
    public void testingHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertFalse("У самок нет гривы", actual);
    }

    @Test
    public void testingFoodOfLine() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertEquals("Ошибка с вписке животных", expected, actual);
    }
}
