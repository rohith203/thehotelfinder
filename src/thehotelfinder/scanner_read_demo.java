import java.io.*;
import java.util.Scanner;
class three{
    public static void main(String args[]){
        
        File obj=new File("1.txt");
        try{
            Scanner sc=new Scanner(obj);
            // while(sc.hasNextLine()){
            //     System.out.println(sc.nextLine());
            // }
            sc.useDelimiter("\\z");//what is this???
            System.out.println(sc.next());
        }
        catch(Exception e){
            System.out.println("file not found error");
        }
    }
}