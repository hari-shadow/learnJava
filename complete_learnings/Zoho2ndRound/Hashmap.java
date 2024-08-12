package Zoho2ndRound;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<>();
        obj.put(4,"hari");
        obj.put(1,"nari");
        System.out.println(obj.get(4));
        System.out.println(obj.containsValue("nari"));
        System.out.println(obj.containsKey(4));
        obj.put(1,"bala"); // replaces the first given "nari" if already available, if not add to the maps
        obj.replace(1,"bala"); // replaces if already available, if not , then doesnt do anything;
        obj.putIfAbsent(4, "hari1");
        obj.remove(1);
    }
}
