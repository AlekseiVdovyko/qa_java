import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalWithParametersTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalWithParametersTest(String animalKind, List<String> animalFood) {
        this.animalKind = animalKind;
        this.expected = animalFood;
    }

    @Parameterized.Parameters
    public static Object[] getFoodAnimal() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void animalGetFoodTest() throws Exception {
        Animal animal = new Animal();
        Animal animalSpy = Mockito.spy(animal);
        List<String> actual = animalSpy.getFood(animalKind);
        Assert.assertEquals("Ошибка в пище животного", expected, actual);
    }
}
