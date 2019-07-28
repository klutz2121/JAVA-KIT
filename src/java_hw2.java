// This include both wanted programmes
public class java_hw2 {
    public static void main(String[] args) {
        int lowerbound = 1, higherbound = 100;
        int total = ans.sum(lowerbound, higherbound);
        double avg = ans.average(total);
        System.out.println("The total is : " + total + " and average is : " + avg );
        System.out.println("The sum of all square is : " + square.sqr(lowerbound, higherbound));
    }
}
class ans{
    static int sum(int num1, int num2) {
        int res = 0;
        for (int i = num1; i <= num2; i++) {
            res += i;
        }
        return res;
    }
    static double average(int x){
        int avgs = x / 100;
        return avgs;
    }
}
class square{
    static int sqr(int a, int b){
        int res = 0;
        for ( int i = a; i <= b; i++ ){
            res += (i*i);
        }
        return res;
    }
}
