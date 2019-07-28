import java.util.*;

public class java12_hash {
    public static void main(String[] args) {
        HashSet mony = new HashSet();
        mony.add("I love Friedn Chicken");
        mony.add("I love Pasta");
        mony.add("I love Chips");
        mony.add("One sided love");
        mony.add("I love Pasta");
        Iterator<String> yuon = mony.iterator();
//        while(yuon.hasNext()){
//            System.out.println(yuon.next());
//        }
//        mony.remove()
        System.out.println(mony);
    }
}
