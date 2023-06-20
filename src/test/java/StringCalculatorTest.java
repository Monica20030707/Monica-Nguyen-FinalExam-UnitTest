import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    public static void main(String[] args) {
        StringCalculator String = new StringCalculator();
    }

    public void test1(){

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("-1,5");
        }, "Negatives not allowed.");
    }
    public void test2(){
        int test2 =StringCalculator.add("1,1000");
        assertEquals(1,test2);
    }
}
