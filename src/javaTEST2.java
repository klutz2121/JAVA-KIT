import java.util.*;

public class javaTEST2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        sum obj1 = new sum();
        System.out.println("My super class is : " + obj1.getClass().getSuperclass().getName());
        System.out.println(obj1.sum(30,12 ) + " " + obj1.sum(10,3) + " " + obj1.sum(10,10));
    }
}
class Arithmetic{

}
class sum extends Arithmetic{
    public int sum(int a, int b){
        int res = a + b;
        return res;
    }
}
