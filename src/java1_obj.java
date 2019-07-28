public class java1_obj {
    public static void main(String args[]){
        //Creating objects
        obj1 ex1 = new obj1();
        obj1 ex2 = new obj1();
        ex1.id = 100;
        ex2.id = 200;
        ex1.name = "Grammonde";
        ex2.name = "Cleric";
        System.out.println(ex1.id + " " + ex1.name);
        System.out.println(ex2.id + " " + ex2.name);
    }
}
class obj1
{
    int id;
    String name;
}
