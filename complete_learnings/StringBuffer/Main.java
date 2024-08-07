package StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("hari");
        String string = str.toString();
        System.out.println(string);
        System.out.println(str.indexOf("a"));
        System.out.println(str.deleteCharAt(2));
    }
}
