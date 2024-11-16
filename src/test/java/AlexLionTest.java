import com.example.AlexLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Spy
    public AlexLion alexLion = new AlexLion(new Feline());

    public AlexLionTest() throws Exception {
    }

    @Test
    public void getValueKittensFromAlexLionPositiveTest() {
        Assert.assertEquals("У Алекса нет львят", 0, alexLion.getKittens());
    }

    @Test
    public void getValueKittensFromAlexLionNegativeTest() {
        Assert.assertNotEquals("У Алекса нет львят", 1, alexLion.getKittens());
    }

    @Test
    public void testingGetLivingAlexLion() {
        Assert.assertEquals("Ошибка в адресе зоопарка","Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testingGetFriendsAlexLion() {
        List<String> actual = new ArrayList<>();
        actual.add("Марти");
        actual.add("Глории");
        actual.add("Мелман");
        List<String> expected = alexLion.getFriends();
        Assert.assertEquals("Ошибка в имени друзей", expected, actual);
    }
}
