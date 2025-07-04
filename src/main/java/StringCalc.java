public class StringCalc
{
    public int add(String num){
        if(num.isEmpty()){
            return 0;
        }

        String numbers[] = num.split(",");

        if(numbers.length == 1)
            return Integer.parseInt(numbers[0]);
        else{
            int ans = 0;
            for(String number : numbers)
            {
                ans += Integer.parseInt(number);
            }
            return ans;
        }
    }
}
