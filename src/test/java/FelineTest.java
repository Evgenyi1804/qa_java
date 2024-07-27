import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineFamilyTest() {
        String expectedResult = "Кошачьи";
        assertEquals(feline.getFamily(), expectedResult);
    }

    @Test
    public void felineFoodIsMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыбы");
        assertEquals(feline.eatMeat(), expectedResult);
    }
}