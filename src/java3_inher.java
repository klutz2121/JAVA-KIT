// DW : Why java can't support multiple inheritance?
// => To avoid ambiguity error java does not support multiple inheritance through class. But through the interface, multiple inheritance is possible in java. No java doesn't support multiple inheritance directly because it leads to overiding of methods when both extended class have a same method name.
// super : has the ability to access all of the parent class
// extends : to connect between one child class and child class to parent class
public class java3_inher {
    public static void main(String args[]){
        String taste = "Shit";
        hotDog obj2 = new pasta();
        obj2.haha();
    }
}
class hotDog
{
    String taste = "Delicious";
    void haha(){
        System.out.println("yuiop");
    }
}
class pasta extends hotDog
{
    String taste = "Yummy";
    void haha()
    {
        System.out.println(taste);
    }
}
