package Zoho2ndRound;

public class q1 {
    public static void main(String[] args) {
        int integer = 4826;
        int digit = 8;

        StringBuilder sb = new StringBuilder();
        String numString = Integer.toString(integer);
        for (int i = 0; i < numString.length(); i++) {
            char ch = numString.charAt(i);
            sb.append(Character.getNumericValue(ch)+digit);

        }
        System.out.println(sb);
    }
}
