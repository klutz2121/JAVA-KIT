import java.io.BufferedReader;
import java.util.Scanner;
// BufferReader is a class in package of io or java i/o
public class java2_inp {
    public static void main(String args[]){
        //Using scanner to get input from user
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name:");
        System.out.println(inp.nextLine());
    }
}
