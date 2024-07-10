package SearchingAlgorithms;

import java.util.Arrays;

public class LinearInString {
    public static void main(String[] args) {
        String name = "hari";
        char target = 'j';
        System.out.println(isTargetIn(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);

    }

    static boolean isTargetIn(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
