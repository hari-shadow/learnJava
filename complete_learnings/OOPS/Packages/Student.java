package OOPS.Packages;

public class Student {
    public static void main(String[] args) {
        Classroom hari = new Classroom(16, "hari", 2003);
        System.out.println(Classroom.classTeacherName);
    }

    static void greet(){
        System.out.println("good");
        Student obj = new Student();
        obj.function();

    }

    void function(){
        System.out.println("df");
        greet();
    }
}
