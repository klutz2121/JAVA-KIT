import java.util.*;

interface food{
    String getType();
}
class foodFactory{
    public food getFood(String foods){
        if(foods == "pizza") {
            pizza piz = new pizza();
            return piz;
        }
        else{
            cake ck = new cake();
            return ck;
        }
    }
}
class pizza implements food{
    public String getType(){
        return "Fast Food";
    }
}
class cake implements food{
    public String getType(){
        return "Dessert";
    }
}
class main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the food you wanna order:");
        String food = inp.next();
        foodFactory obj = new foodFactory();
        System.out.println("The factory returned " + obj.getFood(food).getClass());
        System.out.println("Someone ordered " + obj.getFood(food).getType() + "!");
    }
}