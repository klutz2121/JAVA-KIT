public class java8_multiThread {
    //Multi thread is a light weight sub-process
    // Each every method in the class considered as Thread
    // Implement basic thread : start(), run(), sleep()
}
//class c1{
//    public void show() {
//        for ( int i = 1; i <= 5; i++ ) {
//            System.out.println("Khe Panha is Vietnamese");
//        }
//    }
//}
//class c2{
//    public void show(){
//        for( int i = 1; i <= 5; i++ ){
//            System.out.println("Ah yuon");
//        }
//    }
//}
class c3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class c4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Por favore");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class threaddemo{
    public static void main(String[] args) {
        //c1 obj1 = new c1();
        //c2 obj2 = new c2();
        c3 obj3 = new c3();
        c4 obj4 = new c4();
        //obj1.show();
        //obj2.show();
        // Con currency operation is to hold on 2 class execution
        obj3.start();
        try{
            Thread.sleep(1000); // hold on the execution for 1s
        }
        catch (Exception e){    // no exception is needed to be caught
        }
        obj4.start();
    }
}
