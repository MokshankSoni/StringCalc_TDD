import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalc_Test
{
    @Test
    void emptyString()
    {
        //testing the empty string with wrong expected result 1 and then with correct expected result 0
        //the test also passes for non empty string as a default return 0 is set for the add function

        StringCalc calc = new StringCalc();
        assertEquals(0 ,calc.add(""));
    }
}
