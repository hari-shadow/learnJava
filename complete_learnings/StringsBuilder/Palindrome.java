package StringsBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String name = "i";
        boolean status= true;
        int start = 0;
        int end = name.length()-1;
        while (start <= end){
            if (name.charAt(start) == name.charAt(end)){
                start++;
                end --;
            }
            else{
               status = false;
               break;
            }
        }
        System.out.println(status);
    }
}
