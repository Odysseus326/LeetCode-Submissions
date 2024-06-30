class Solution
{
    public int romanToInt(String s)
    {
        int num = 0;
        for(int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    if(i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    num -= 1;
                    } else {
                        num += 1;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        num -=10;
                    } else {
                        num += 10;
                    }
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        num -= 100;
                    } else {
                        num += 100;
                    }
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }
        }
        return num;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        String num1 = "MDCLXVI";
        String num2 = "VIII";
        String num3 = "IV";

        Solution calculate = new Solution();
        int result1 = calculate.romanToInt(num1);
        int result2 = calculate.romanToInt(num2);
        int result3 = calculate.romanToInt(num3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}