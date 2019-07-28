import java.io.Serializable;
import java.lang.reflect.Modifier;

// public : everyone can use or access
// protected : given authorisation needed to access
// private : only one
// final : is feature from var, method and class
// -> Limitation of "final" is 10
// Final can't be used with char and String
// static : unchangeable
// Native : DLL => using other programme header file
// ** we can use C, C++, assembler header file in java
// ** Each and every part of class of java are considered as threat in java
// volatile : everything which you wanna share between one java file and another
// Modifier :
// Serialisation : is nothing but the client side
// transient : is the opposite of Serialisation which is on server side
// Synchronisation : , it's seem like pair but not.
// interface : for only var and method declaration
/* The differences between abstract and interface :
    - abstract has initialisation
    - interface no initialisation
*/
// strictfp : IEEE 754 => give accurate value
// to connect class to interface we need to use the keywords "implement"
// interface is nothing but the concept of abstract and declaration not explanation
// IF default error the invalid token will be shown up which mean you need to update first
// DW : take one example and write code as example and submit!!!
public class java4_keywords {
    public static void main(String[] args) {
        Circle user = new Circle();
        Rectangle user1 = new Rectangle();
        user.draw();
        user1.draw();
    }
}
abstract class shape{
    void draw(){
        System.out.println("What the hell am I doing");
    }
}
class Circle extends shape {
    void draw(){
        System.out.println("Drawing CIrcle!");
    }
}
class Rectangle extends shape{
    void draw(){
        System.out.println("Drawing kdr");
    }
}
