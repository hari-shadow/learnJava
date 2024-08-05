package OOPS.Properties.Inheritance;

public class AnotherBox extends Box{

    double weight;

    AnotherBox(){
        this.weight = -1;
    }

    AnotherBox(double weight){
        this.weight = weight;
    }

    AnotherBox(double length, double width, double height, double weight){
        super(length,width,height,weight);
        this.weight = weight;
    }

    AnotherBox (AnotherBox anotherBoxObject){
        super(anotherBoxObject.length,anotherBoxObject.width);
        this.weight = anotherBoxObject.weight;
    }

    AnotherBox (Box BoxObject){
        super.weight = BoxObject.weight;
    }

}
