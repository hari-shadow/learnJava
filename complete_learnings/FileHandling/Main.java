package FileHandling;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        *https://www.youtube.com/watch?v=ScUJx4aWRi0
        *
        * import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
  public static void main(String[] args) {

    String[] names = {"John", "Carl", "Jerry"};
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Writing to a file.");
      writer.write("\nHere is another line.");

      for (String name : names) {
        writer.write("\n" + name);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

        *
        *
        * */

        // -------reading input from keyboard
        //---------------way 1-------------
//        try(BufferedReader ip = new BufferedReader(new InputStreamReader(System.in))){
//            int letters = ip.read();
//            while(ip.ready()){
//
//                System.out.print( letters);
//                letters = ip.read();
//            }
//        }catch(IOException e){
//            System.out.println((char) 65535);
//        }
////--------------way 2-----------------
//        try(BufferedReader ip = new BufferedReader(new InputStreamReader(System.in))){
//            String letters = ip.readLine();
//
//            System.out.print( letters);
//
//        }catch(IOException e){
//            System.out.println((char) 65535);
//        }


        // ---------reading from a file

//        try(FileReader file = new FileReader("name.txt")){
//            int letters = file.read();
//            while(file.ready()){
//                System.out.print((char) letters);
//                letters = file.read();
//
//            }
//
//        }catch(IOException e){
//            System.out.println("exception occurred");
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }

        // ---- writhing a file

//        try(FileWriter file = new FileWriter("name.txt")){
//            file.append("\nhafrfi");
//        }catch(IOException e){
//            System.out.println("exception occurred");
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }


        try(BufferedWriter file = new BufferedWriter(new FileWriter("name.txt",true))){//true tells to append in the file not overwrite it
            file.write("\nhaffdfgsrfi");
        }catch(IOException e){
            System.out.println("exception occurred");
            System.out.println(Arrays.toString(e.getStackTrace()));
        }



    }
}
