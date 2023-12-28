package main.java;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("dasd", "dsad"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            charCounts[index]--;
            if (charCounts[index] < 0) {
                return false;
            }
        }

        return true;
    }

}
