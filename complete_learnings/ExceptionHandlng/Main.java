package ExceptionHandlng;

public class Main {

    static int Divide(int a, int b) throws ArithmeticException{

        if (b == 0){
            throw new ArithmeticException("df");
        }
        return a/b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 20;


        try {
            System.out.println(Divide(a,b));
            throw new Exception();

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("just");
        }finally {
            System.out.println(5);
        }
    }
}
