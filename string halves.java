public class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int countA = 0;
        int countB = 0;

        // Count vowels in the first half
        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                countA++;
            }
        }

        // Count vowels in the second half
        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                countB++;
            }
        }

        return countA == countB;
    }

    private boolean isVowel(char c) {
        // Check for both lowercase and uppercase vowels
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
