import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionWithParametersTest {

    private final String sex;
    private final Feline feline;
    private final boolean expected;

    public LionWithParametersTest(String sex, Feline feline, boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] createLionConstructor() {
        return new Object[][] {
                {"Самец", new Feline(), true},
                {"Самка", new Feline(), false}
        };
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Lion lionSpy = Mockito.spy(lion);
        boolean actual = lionSpy.doesHaveMane();
        Assert.assertEquals("Ошибка в значении пола животного", expected, actual);
    }
}