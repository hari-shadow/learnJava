package Zoho2ndRound;

public class q15 {
    public static void main(String[] args) {
        String qn = "a@b,c";
        char[] charr = qn.toCharArray();

        int start = 0;
        int end = charr.length-1;

        while (start< end){
            if (!Character.isLetterOrDigit(charr[start])){
                start++;
            } else if (!Character.isLetterOrDigit(charr[end])) {
                end--;
            }
            else {
                char temp = charr[end];
                charr[end] = charr[start];
                charr[start] = temp;
                start++;
                end--;
            }
        }
        String ans = new String(charr);
//        StringBuilder sb = new StringBuilder();
//        for(char el : charr){
//            sb.append(el);
//        }
        System.out.println(ans);


    }
}
