import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void getFoodReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> actualEatMeat = feline.eatMeat();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutArgumentReturnsOne() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensWithArgumentReturnsArgument() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(3);
        int expectedKittensCount = 3;
        assertEquals(expectedKittensCount, actualKittensCount);
    }
}



