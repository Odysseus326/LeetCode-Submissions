// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

class Solution {
    int lengthOfLastWord(String s) {
        
        int i = s.length() - 1;
        int lastIndexOfWord = s.length();
        String lastWord;

        if(s.length() < 1)
            return 0;

        while(s.charAt(i) == ' ') {
            lastIndexOfWord = i;
            i--;
            if (i < 0)
                return 0;

        }
        while(i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        lastWord = s.substring(i+1, lastIndexOfWord);
        return lastWord.length();
    };
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        String sentence = ("Hi there! My name is Evan Brentson");
        System.out.println(solution.lengthOfLastWord(sentence));

        sentence = ("");
        System.out.println(solution.lengthOfLastWord(sentence));

        sentence = ("IAmOneWordWithNoSpaces");
        System.out.println(solution.lengthOfLastWord(sentence));

        sentence = ("I feel like putting spaces at the end   ");
        System.out.println(solution.lengthOfLastWord(sentence));

    }
}
