import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalcTest
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

    @Test
    void sumOfMultiInt()
    {
        //tested for comma separated two integers in string should return the sum of two but failed
        //updated the add() function to handle multiple numbers in a string with comma separation

        StringCalc calc = new StringCalc();
        assertEquals(14,calc.add("3,6,5"));
    }

    @Test
    void newLineDelim()
    {
        //updated the add() function to handle new line as a delimeter
        StringCalc calc = new StringCalc();
        assertEquals(4,calc.add("3\n1"));
    }

    @Test
    void newCustomDelim()
    {
        // checked for custom delim ";" and passed for this approach
        // delimeter += "|" + num.substring(2,customDelimPo);
        // but fails for "*" as it is a special symbol in Regex
        // using pattern.quote() to make it a normal literal from a special symbol for regex
        StringCalc calc = new StringCalc();
        assertEquals(4,calc.add("//*\n3*1"));
    }

    @Test
    void negativeNumCheck()
    {
        // added a check of negative numbers in add() func that throws exception on a negative number
        StringCalc calc = new StringCalc();

        assertEquals(2,calc.add("1,-3,4,5,-6,1")); //throws illegal argument exception
    }

    @Test
    void numGreaterThan1000()
    {
        // added the check to ignore the numbers greater than 1000
        StringCalc calc = new StringCalc();

        assertEquals(2,calc.add("1001,1,1"));
    }

    @Test
    void multiLengthDelimeter()
    {
        // added a check of negative numbers in add() func that throws exception on a negative number
        StringCalc calc = new StringCalc();

        assertEquals(4,calc.add("//[**]\n3**1"));
    }

}
