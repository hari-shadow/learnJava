package Zoho2ndRound;

import java.util.LinkedHashSet;
import java.util.Set;

public class q13 {
    public static void main(String[] args) {
        String qn = "aaabbbcc";

        Set<Character> set = new LinkedHashSet<>();
        for(char ch :qn.toCharArray()){
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(Character ch : set){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
