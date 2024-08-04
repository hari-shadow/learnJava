package OOPS.Packages;

public class InnerClasses {
    static class Test{
        int a;

        Test(int a) {
            this.a = a;
        }
    }

    void just(){
        Test obj = new Test(6);
        System.out.println(obj.a);
    }
    public static void main(String[] args) {
        Test obj = new Test(5);

        System.out.println(obj.a);

    }
}
