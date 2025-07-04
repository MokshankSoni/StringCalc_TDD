import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalc
{

    public int add(String num)
    {
        if (num.isEmpty())
        {
            return 0;
        }

        String delimeter = ",|\n";

        if (num.startsWith("//"))
        {
            int customDelimPo = num.indexOf("\n");
            String delimiterSection = num.substring(2, customDelimPo);
            List<String> delimiters = new ArrayList<>();

            //multiple or long delimeters
            if (delimiterSection.startsWith("["))
            {
                while (delimiterSection.contains("["))
                {
                    int start = delimiterSection.indexOf("[") + 1;
                    int end = delimiterSection.indexOf("]");

                    delimiters.add(Pattern.quote(delimiterSection.substring(start, end)));
                    delimiterSection = delimiterSection.substring(end + 1);
                }
            }
            else {
                // Single-char delimiter
                delimiters.add(Pattern.quote(delimiterSection));
            }

            delimeter = String.join("|", delimiters);
            num = num.substring(customDelimPo + 1);
        }

        String[] numbers = num.split(delimeter);
        int ans = 0;
        List<Integer> negativeNum = new ArrayList<>();

        for (String number : numbers) {
            int value = Integer.parseInt(number);
            if (value < 0) {
                negativeNum.add(value);
            }
            if (value <= 1000) {
                ans += value;
            }
        }

        if (!negativeNum.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed : " +
                    negativeNum.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")));
        }
        return ans;
    }
}