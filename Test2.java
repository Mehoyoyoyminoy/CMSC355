import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class Test2 {

    @Test
    public void testMultiplyWithStrings() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.multiply("a", "b");
        });
    }
}
//
