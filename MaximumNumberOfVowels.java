public class MaximumNumberOfVowels {

    public static int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            // Add new character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove old character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        int answer = maxVowels(s, k);

        System.out.println("Maximum Vowels = " + answer);
    }
}