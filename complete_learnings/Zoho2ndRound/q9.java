package Zoho2ndRound;

import java.util.HashSet;
import java.util.Set;

public class q9 {
    public static void main(String[] args) {
        String s1 = "ExperIencE";
        String s2 = "En";

        Set<Character> set = new HashSet<>();
        char[] charr = s2.toCharArray();
        for(char ch :charr){
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        char[] chars1 = s1.toCharArray();
        for(char ch: chars1){
            if (!set.contains(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
