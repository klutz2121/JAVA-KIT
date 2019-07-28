import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.*;

/*[1,2,3]- - array
* 1. Create new space
* 2. */
/*List : we can extend the memories space*/

// Task 1
public class java12_listArr {
    public static void main(String[] args) {
        // To extend the memories space with no boundary
        List<String> name = new ArrayList<String>();
        name.add("Ah Eich");
        name.add("Ah yuon");
        name.add("Ah Paong");
        name.add("Ah KBTh");
        name.add("Ah Beurn");

        ArrayList<String> name1 = new ArrayList<String>();
        name1.add("Ah Eich");
        name1.add("Ah yuon");
        name1.add("Ah Paong");
        name1.add("Ah KBTh");
        name1.add("Ah Beurn");
        System.out.println(name);

        // Task 2 : add element to 1st pos
        name.add(0,"MonyNVL");
        System.out.println(name);

        // Task 3 : remove third index of array
        name.remove(2);
        System.out.println(name);

        // Task 4 : sort teh array with collection.sort(obj)
        Collections.sort(name);
        System.out.println(name);

        //Task 5 : shuffle the arrayList with Collections.shuffle(obj)
        Collections.shuffle(name);
        System.out.println(name);

        //Task 6 : extract first 4 reg no among your classroom
        List<String> norok = name.subList(0,3);
        System.out.println(norok);

        //Task 7 : increase teh size of arraylist
        // To allocate of the memories
        // If the minCapacity is 10 and currently have 5 => 14 memories space reserved
        name1.ensureCapacity(10);
        System.out.println(name1.size());

        //Task 8 : create 2D arraylist
        ArrayList<String> arr = new ArrayList<String>();
        String nombre;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the name of your classmate:");
        for( int i = 0; i < 5; i++ ) {
            nombre = inp.nextLine();
            if( i % 2 == 0 ){
                arr.add(i,nombre);
            }
            else{
                arr.add(i,nombre);
            }
        }
        for ( int j = 0; j < 5; j++ ){
            if ( j % 2 == 0 ){
                System.out.println(arr.get(j)+" is blood type of O+");
            }
            else{
                System.out.println(arr.get(j)+" is blood type of AB+");
            }
        }
    }
}


