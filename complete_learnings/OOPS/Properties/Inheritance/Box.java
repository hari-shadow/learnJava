package OOPS.Properties.Inheritance;

public class Box {
    double length;
    double width;
    double height;
    double weight;

    Box(double length, double width, double height, double weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

   Box(double length, double width) {
        this.length = length;
        this.width = width;
   }

   Box (){
        this.length = -1;
        this.width = -1;
        this.height = -1;
        this.weight = -1;
   }

   Box (Box boxObject){
        this.length = boxObject.length;
        this.width = boxObject.width;;
        this.height = boxObject.height;
        this.weight = boxObject.weight;
   }
}
