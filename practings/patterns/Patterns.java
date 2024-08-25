import java.util.Scanner;

public class Patterns {

    static void patternB(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
    static void patternE(int a){
        for (int i = 1; i <= a; i++) {
            int value = (i%2==0)?0:1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = (value==0)?1:0;
            }
            System.out.println();
            
        }
    }
    static void patternF(int a){
        int value = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value++ + " ");
            }
            System.out.println();
            
        }
    }
    static void patternG(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    static void patternG1(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
    static void patternG2(int a){
        for (int i = 1; i <= a; i++) {
            int just = a;
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(just-- + " ");
            }
            just= a;
            System.out.println();
            
        }
    }
    static void patternI(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    static void patternJ(int a){
        for (int i = 1; i <= 2*a-1; i++) {
            if (i <= a){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j +" ");
                }
            }else{
                for (int j = 1; j <= 2*a-i; j++) {
                    System.out.print(j +" ");
                }
            }
            
            System.out.println();
        }
    }
    static void patternK(int a){
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 2*(a-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void patternK1(int a){
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void patternL(int a){
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a-i)+1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void patternM(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternN(int a){
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternO(int a){
        for (int i = 1; i <=2*a -1; i++) {
            int spaces = (i<=a)? (a-i) : (i-a);
            int values = (i <= a) ? (2*i -1) : 2*(2*a - i)-1;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= values; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternP1(int a){
        for (int i = 1; i <= 2*a -1 ; i++) {
            int spaces = (i <= a)?i-1:2*a-1-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*(a-spaces) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void patternQ(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a -i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                // if(i != 1 && i != a){
                //     if(j == 1 || j == 2*i-1){
                //         System.out.print("*");
                //     }else{
                //         System.out.print(" ");
                //     }
                // }else{
                //     System.out.print("*");
                // }


                if(j == 1 || j == 2*i-1 || i == a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void patternR(int a){
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i -1; j++) {
                if(j == 1 || j == 2*i-1 || i == a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patternS(int a){
        for (int i = 1; i <= 2*a -1; i++) {
            for (int j = 1; j <= Math.abs(i-a); j++) {
                System.out.print(" ");
            }
            int stars = (i <= a)?2*i -1:2*(2*a -i)-1;
            for (int j = 1; j <= stars; j++) {
                if(j == 1 || j == stars){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patternT(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < a; j++) {
                if(i == 1 || i == a || j == 1 || j == a-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patternU(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < a; j++) {
                if(i == 1 || i == a || j == 1 || j == a-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patternU1(int a){
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < a; j++) {
                if(i == 1 || i == a || j == 1 || j == a-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void patternV(int a){
        for (int i = 2*a; i >= 1; i--) {
            int stars = (i>a)?Math.abs(a-i):Math.abs(a-i) +1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            int spaces = (i<=a)?(2*(i-1)):2*(2*a -i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternW(int a){
        for (int i = 1; i <= 2*a -1; i++) {
            int stars = (i>=a)? (2*a - i):(i);
            int spaces = 2*(Math.abs(a-i));
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternX(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void patternY(int a){
        for (int i = 1; i <=a; i++) {
            int spaces = 2*(a-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void patternZ1(int a){
        for (int i = 1; i <= 2*a -1; i++) {
            for (int j = 1; j <= 2*a -1; j++) {
                System.out.print(Math.min(Math.min(i, j), Math.min(2*a -i, 2*a -j))+" ");
            }
            System.out.println();
        }
    }
    static void patternZ(int a){
        for (int i = 1; i <= 2*a -1; i++) {
            for (int j = 1; j <= 2*a -1; j++) {
                int c = Math.min(Math.min(i, j), Math.min(2*a -i, 2*a -j));
                System.out.print(a - c + 1+" ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
       
        patternZ(a);

        input.close();
    
    }


}