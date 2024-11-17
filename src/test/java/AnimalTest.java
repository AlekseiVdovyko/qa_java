import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    private Animal animal = new Animal();

    @Test
    public void animalWrongArgumentGetFoodTest() throws Exception {
        Assert.assertThrows("Вызов должен вызвать исключение Exception", Exception.class, () -> animal.getFood("Wrong argument"));
    }

    @Test
    public void animalGetFamilyTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        Assert.assertEquals("Возвращен неверный результат", expected, actual);
    }
}
