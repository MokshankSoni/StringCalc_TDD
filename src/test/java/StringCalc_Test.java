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

    @Test
    void singleInt()
    {
        //testing the single integer string without updating the add()
        // and after updating add() to handle single integer

        StringCalc calc = new StringCalc();
        assertEquals(1 ,calc.add("1"));
    }
}
