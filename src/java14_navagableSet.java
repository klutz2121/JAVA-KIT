import com.sun.source.tree.Tree;
import java.util.*;
import java.util.NavigableSet;

public class java14_navagableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> bulshik = new TreeSet<>();
        NavigableSet<Integer> fuqubik = new TreeSet<>();
        Integer str;
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i < 16; i++){
            bulshik.add(i);
        }
        System.out.println(bulshik);
        while(true){
            try{
                System.out.println("Enter Absent Student ID:");
                str = scan.nextInt();
                fuqubik.add(str);
                /*if(fuqubik.contains(str)){
                    bulshik.remove(str);
                    bulshik.add(0);*/
            }catch (Exception e){
                break;
            }
        }
        System.out.println(fuqubik);
        //System.out.println(bulshik);
    }
}
