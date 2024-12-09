import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals("Ошибка в наличии гривы у животного", expected, actual);
    }
}