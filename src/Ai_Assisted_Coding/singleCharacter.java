package Ai_Assisted_Coding;

import java.util.HashMap;

public class singleCharacter {

    public static int firstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "swiss";
        int answer = firstNonRepeating(s);

        if (answer == -1) {
            System.out.println(-1);
        } else {
            System.out.println((char) answer);
        }

    }
}