public class java9_thread2 {
    public static void main(String[] args) {
        join1 obj1 = new join1();
        join1 obj2 = new join1();
        join1 obj3 = new join1();
        obj1.start();
        try{
            obj1.join();    // join() : to finish one object execution
        }
        catch (Exception e){
            System.out.println(e);
        }
        /*obj2.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        obj3.start();*/
        obj2.start();   // The output is the same as the above comment code
        obj3.start();
    }
}
class join1 extends Thread{
    public void run(){
        for( int i = 1; i <= 5; i++ ){
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
