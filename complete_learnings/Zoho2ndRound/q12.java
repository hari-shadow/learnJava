package Zoho2ndRound;

import java.util.HashSet;
import java.util.Set;

public class q12 {
    public static void main(String[] args) {
//        String qn = "abc defGhi JklmnOP QRStuv";
        String qn = "abc defGhi JklmnOP QRStuv wxyz";

        Set<Character> set = new HashSet<>();
        for(char el : qn.toLowerCase().toCharArray()){
            if (el >= 'a' && el<='z'){
                set.add(el);

            }
        }
        if (set.size()==26){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
