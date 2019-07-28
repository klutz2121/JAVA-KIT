public class java10_task {
    public static void main(String[] args) {
        odd obj1 = new odd();
        even obj2 = new even();
        obj1.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
        }
        obj2.start();
    }
}
class odd extends Thread{
    public void run(){
        for( int i = 1; i <= 5; i++ ){
            if( i % 2 != 0 ){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class even extends Thread{
    public void run(){
        for( int j = 1; j <= 5; j++ ){
            if( j % 2 == 0 ){
                System.out.println(j);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}