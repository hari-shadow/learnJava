package OOPS.Polymorphism;

public class ObjectPrint {
    String name;

    public ObjectPrint(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ObjectPrint{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        ObjectPrint obj =new ObjectPrint();
//        obj.name = "df";
//        ObjectPrint obj1 = new ObjectPrint();
//        obj1.name = "dfadsf0";
//        System.out.println(obj.name);
//        System.out.println(obj1.name);

        ObjectPrint obj = new ObjectPrint("hari ");

        System.out.println(obj);


    }

}

