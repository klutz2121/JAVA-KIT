import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class javaTEST {
    public static void main(String[] args) {
        int j = 1;
        HashMap<String, String> logb = new HashMap<String, String>();
        System.out.println("Enter number of people:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1; i <= n; i++){
            try {
                System.out.println("Enter the name and Phone number");
                String name = inp.next();
                String num = inp.next();
                logb.put(name, num);
            }
            catch(Exception e){
                System.out.println("Done");
            }
        }
        for(Map.Entry a:logb.entrySet()){
            System.out.println(a.getKey() + " = " + a.getValue());
        }
        while( j <= n ){
            System.out.println("Please enter name which you wanna find:");
            String namec = inp.next();
            if( logb.get(namec) == null ){
                System.out.println("Not Found");
            }
            else{
                System.out.println(namec + "=" +logb.get(namec));
            }
            j++;
        }
    }
}
