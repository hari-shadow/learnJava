package Zoho2ndRound;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset{
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
//        List<String> name1 = new ArrayList<>();
        name.add("Hari");
        name.add("Hari");
        System.out.println(name.contains("Hari"));
        System.out.println(name.isEmpty());

        name.remove("Hari");
        System.out.println(name);
        name.clear();// removes all the elements in the set

    }


}
