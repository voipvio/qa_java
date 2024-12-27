import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnsPredatorMeal() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actualEatMeat = cat.getFood();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

}
