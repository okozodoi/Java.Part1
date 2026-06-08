package Part1;

public class Task2 {
    public static void main(String[] args) {

        String stringToReverse = "I'm going to go to school today morning.";

        System.out.println("Method 1: " + reverseWithStringBuilder(stringToReverse));
        System.out.println("Method 2: " + reverseWithLoop(stringToReverse));
        System.out.println("Method 3: " + reverseWithRecursion(stringToReverse));
        System.out.println("Method 4: " + reverseWithArray(stringToReverse));
    }

    public static String reverseWithStringBuilder(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static String reverseWithLoop(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String reverseWithRecursion(String text) {
        if (text.isEmpty()) {
            return text;
        }
        return reverseWithRecursion(text.substring(1)) + text.charAt(0);
    }

    public static String reverseWithArray(String text) {
        char[] chars = text.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
