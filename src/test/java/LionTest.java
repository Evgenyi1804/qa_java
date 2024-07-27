import com.example.Feline;
import com.example.Lion;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.junit.Assert;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    Feline feline;
    @Test
    public void lionFoodIsMeatTest() throws Exception {
        Lion lion = new Lion("Самец",  feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыбы");
        assertEquals(expectedResult, lion.getFood());
    }
    @Test
    public void incorrectLionSexTest() throws Exception   {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("оно", feline);
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }
    @Test
    public void lionFemaleIsFalseTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }
    @Test
    public void lionMaleIsTrueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }
}