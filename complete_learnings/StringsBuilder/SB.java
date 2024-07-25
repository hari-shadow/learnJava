package StringsBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.reverse());

        StringBuilder name = new StringBuilder();
//        name = "hari";
        name.append("hari");
        StringBuilder just = name.reverse();
        System.out.println(name);
        System.out.println(just);
        System.out.println(name.equals(just));
////        String series = "";
////        for (int i = 0; i < 26; i++) {
////            char ch = (char) ('a'+i);
////            series += ch;
//        }
//        System.out.println(series);
    }
}
