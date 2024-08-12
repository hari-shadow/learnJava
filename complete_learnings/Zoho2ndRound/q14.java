package Zoho2ndRound;

public class q14 {
    public static void main(String[] args) {
        String qn = "He speaks Malayalam";
        String[] words = qn.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words){
            if (!isPalindrome(word)){
                sb.append(word).append(" ");
            }
        }
        System.out.println(sb);


    }

    static boolean isPalindrome(String word){
        int start = 0;
        int end = word.length()-1;

        while (start < end){
            if(word.toLowerCase().charAt(start) != word.toLowerCase().charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
