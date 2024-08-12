package Zoho2ndRound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q3 {
    public static void main(String[] args) {
        q3 obj = new q3();
        List<String> input = new ArrayList<>();
        input.add("catch");
        input.add("got");
        input.add("tiger");
        input.add("mat");
        input.add("mat");
        input.add("Pat");
        input.add("tap");
        input.add("tea");
        input.add("ate");

        String word = "eat";

        System.out.println(obj.anagram( word, input));
    }

    public List<String> anagram(String word, List<String> list){
        char[] charr = word.toLowerCase().toCharArray();
        Arrays.sort(charr);
        List<String> ans = new ArrayList<>();
        for(String given :list){
            if (given.length() == charr.length){
                char[] check = given.toCharArray();
                Arrays.sort(check);
                if (Arrays.equals(charr,check)){
                    ans.add(given);
                }

            }
        }
        return ans;
    }
}
