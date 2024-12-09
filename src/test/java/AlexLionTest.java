import com.example.AlexLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    private AlexLion alexLion = new AlexLion(new Feline());;

    public AlexLionTest() throws Exception {
    }

    @Test
    public void testingGetFriendsAlexLion() throws Exception {
        List<String> expected = List.of("Марти", "Глории", "Мелман");
        List<String> actual = alexLion.getFriends();
        Assert.assertEquals("Ошибка в имени друзей", expected, actual);
    }

    @Test
    public void testingGetPlaceOfLivingAlexLion() throws Exception {
        String expected = "Нью-Йоркский зоопарк";
        String actual = alexLion.getPlaceOfLiving();
        Assert.assertEquals("Ошибка в адресе зоопарка",expected, actual);
    }

    @Test
    public void getValueKittensFromAlexLionPositiveTest() throws Exception {
        int expected = 0;
        int actual = alexLion.getKittens();
        Assert.assertEquals("У Алекса нет львят", expected, actual);
    }
}
