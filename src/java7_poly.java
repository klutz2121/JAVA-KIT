// Polymorphism :
public class java7_poly {
    /*public static void main(String[] args) {
        // Only one invoked
        System.out.println(c3.add(1,2)); // Compiler will confused because of args passing
        System.out.println(c2.add(10.5,2.5));
        System.out.println(c2.add(5,6));
        System.out.println(c1.add(1,3));
        System.out.println(c1.add(5,6,7));
    }
}
class c3{
    static int add(int a, int b){
        return a + b;
    }
    static double add(int a, int b){
        return a + b;
    }
}
class c2{
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }
}
class c1{
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}*/
}
class Person {
    void walk() {
        System.out.println("Can Run….");
    }
}
class Employee extends Person {
    void walk() {
        System.out.println(" Fast…");
    }
    public static void main(String arg[]) {
        Person p = new Employee(); //upcasting
        p.walk();
    }
}
