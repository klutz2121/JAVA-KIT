import java.io.*;
import java.util.*; // Import the Scanner class to read text files

// To create the new file to store
public class java15_Fileio {
    public static void main(String[] args){
        int i = 0;
        try {
            File dir = new File("D:\\JAVA KIT\\src\\fileio");
            File obj = new File("D:\\JAVA KIT\\src\\fileio\\text1.txt");
            if (dir.mkdirs() || obj.createNewFile() || i == 0) {
                System.out.println("Directory has been created");
                System.out.println("File has been created");
                FileWriter obj1 = new FileWriter("D:\\JAVA KIT\\src\\fileio\\text1.txt");
                obj1.write("Hello ah yuon");
                obj1.close();
                FileReader obj2 = new FileReader("D:\\JAVA KIT\\src\\fileio\\text1.txt");
                Scanner myread = new Scanner(obj2);
                while( myread.hasNextLine() ){
                    String data = myread.nextLine();
                    System.out.println(data);
                }
                myread.close();
            }
            else {
                System.out.println("Fail to create");
            }
        }
        catch(Exception e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}

//To see the data in the
class file2 {
    public static void main(String[] args) {
        File myObj = new File("D:\\JAVA KIT\\src\\fileio\\text1.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

    }

}
