import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMaleArgumentTest {

    @Mock
    private Feline feline;

    @Test
    public void testingHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertTrue("У самцов есть грива", actual);
    }

    @Test
    public void lionWrongConstructorArgumentTest() {
        Assert.assertThrows("Вызов должен вызвать исключение Exception", Exception.class, () -> new Lion("Wrong argument", feline));
    }
}
