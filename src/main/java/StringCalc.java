import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringCalc
{
    public int add(String num){
        if(num.isEmpty()){
            return 0;
        }

        String delimeter = ",|\n";

        //for a normal literal
//        if(num.startsWith("//")){
//            int customDelimPo = num.indexOf("\n");
//            delimeter += "|" + num.substring(2,customDelimPo);
//
//            num = num.substring(customDelimPo + 1);
//        }

        //for a special symbol making it a delimeter
        if(num.startsWith("//")){
            int customDelimPo = num.indexOf("\n");
            delimeter  = Pattern.quote(num.substring(2,customDelimPo));

            num = num.substring(customDelimPo + 1);
        }

        String[] numbers = num.split(delimeter);

        int ans = 0;
        boolean negative = false;

        for(String number : numbers)
        {
            int value = Integer.parseInt(number);
            if(value<0)
                negative = true;
            ans += value;
        }

        if(negative)
        {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }

        return ans;

    }
}
