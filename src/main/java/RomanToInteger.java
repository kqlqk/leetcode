package main.java;

public class RomanToInteger {

    //    public static void main(String[] args) {
//        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
//        System.out.println(new RomanToInteger().romanToInt("LVIII"));
//    }

    public int romanToInt(String s) {
        char[] sChars = s.toCharArray();
        int res = 0;

        for (int i = sChars.length - 1; i >= 0 ; i--) {
            int num = getNumberByRoman(sChars[i]);

            if (i != 0 && getNumberByRoman(sChars[i - 1]) < num) {
                res += num - getNumberByRoman(sChars[i-1]);
                i--;
            }
            else {
                res += num;
            }
        }

        return res;
    }

    private int getNumberByRoman(char a) {
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}

