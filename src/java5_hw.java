import java.util.Optional;


public class java5_hw {
    /*public static void main(String[] args) {
        pizza obj1 = new pizza();
        chips obj2 = new chips();
        obj1.menu();
        obj1.order();
        obj2.menu();
        obj2.order();
    }
}
abstract class Food{
    abstract void order();
    void menu() {
        System.out.println("What can I do for u?");
    }
}
class pizza extends Food{
    void order(){
        System.out.println("Not pizza!!!");
    }
    void menu(){
        System.out.println("Pizza!");
    }
}
class chips extends Food{
    void order(){
        System.out.println("Not chips!!!");
    }
    void menu(){
        System.out.println("Chips please!!!");
    }
*/
public static void main(String[] args) {
        favourite obj1 = new favourite();
        notType obj2 = new notType();
        obj1.whiteAlbum();
        obj1.lifeStr();
        obj2.whiteAlbum();
        obj2.lifeStr();
    }
    interface CD{
        void whiteAlbum();
        void lifeStr();
    }
    static class favourite implements CD{
        public void whiteAlbum(){   // "public" keywords must be used in interface
            System.out.println("I love WhiteAlbum");
        }
        public void lifeStr(){
            System.out.println("What is lifeStr???");
        }
    }
    static class notType implements CD{
        public void whiteAlbum(){
            System.out.println("I don't really like whiteAlbum");
        }
        public void lifeStr(){
            System.out.println("I am a big fan of this!!!");
        }
    }
}
