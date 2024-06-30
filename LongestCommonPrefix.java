class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        if(strs == null || strs.length == 0) return ""; // Returns "".

        String prefix = strs[0]; // Starting prefix before comparison/reduction.

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Executes reduction of current prefix cannot be sources in compared Strings.
                prefix = prefix.substring(0, prefix.length() - 1); // Reduces the size of the prefix by one character.
                if (prefix.isEmpty()) return ""; // Returns "" if no similar prefixes are found.
            }
        }
        return prefix;
    }
}
public class LongestCommonPrefix
{
    public static void main(String args[])
    {
        String strs1[] = {"flower", "flow", "flight"};
        String strs2[] = {"dog", "racecar", "car"};

        Solution solution = new Solution();
        
        String result1 = solution.longestCommonPrefix(strs1);
        String result2 = solution.longestCommonPrefix(strs2);

        System.out.println(result1);
        System.out.println(result2);
    }
}