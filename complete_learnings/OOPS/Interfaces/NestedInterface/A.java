package OOPS.Interfaces.NestedInterface;

public class A {
    public interface NestedInterface{
        boolean isfive(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isfive(int num) {
        return num == 5;
    }

}

