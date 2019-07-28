import java.util.*;

public class javaHWcollege {
    public static void main(String[] args) {
        int countf = 0;
        int counts = 0;
        int ans;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of test");
        int test = inp.nextInt();
        ArrayList<Integer> minP = new ArrayList<>();
        for(int i = 0; i < test; i++){
            System.out.println("Enter price of purple balloon:");
            int p1 = inp.nextInt();
            System.out.println("Enter price of green balloon:");
            int p2 = inp.nextInt();
            System.out.println("Enter the number of participants:");
            int number = inp.nextInt();
            for(int j = 0; j < number; j++){
                System.out.println("Enter 1:");
                int g = inp.nextInt();
                if(g == 1){
                    countf++;
                }
                System.out.println("Enter 2:");
                int p = inp.nextInt();
                if(p == 1){
                    counts++;
                }
            }
            if(countf >= counts){
                if(p1 <= p2){
                    ans = (countf*p1) + (counts*p2);
                }
                else{
                    ans = (countf*p2) + (counts*p1);
                }
            }
            else{
                if(p1 >= p2){
                    ans = (countf*p1) + (counts*p2);
                }
                else{
                    ans = (countf*p2) + (counts*p1);
                }
            }
            minP.add(ans);
            countf = 0;
            counts = 0;
        }
        System.out.println(minP);
    }
}