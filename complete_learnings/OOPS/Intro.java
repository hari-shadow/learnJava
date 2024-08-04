package OOPS;

class  Student{
    int age;
    String name;


    void greeting(){
        System.out.println("good morning  " + this.name);
    }

    Student (int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class Intro {

    public static void main(String[] args) {
        Student hari = new Student(21,"Hari");

        System.out.println(hari.name);
        System.out.println(hari.age);
        hari.greeting();
    }
}
