//Task 1
public class java12_tasks2 {
    public static void main(String[] args) {
        Monkey obj = new Monkey();
        System.out.println(obj.mon(true, false));
        life relax = new life();
        System.out.println(relax.daily(2,false ));
        party happy = new party();
        System.out.println(happy.cond(6,20));
        lottery win = new lottery();
        System.out.println(win.sum(9,1,0));
    }
}
class Monkey{
    public boolean mon(boolean aSmile, boolean bSmile){
        if ( aSmile == bSmile ){
            return true;
        }
        else{
            return false;
        }
    }
}

// Task2
class life{
    public String daily(int day, boolean DailHol){
        if( day > 0 && day < 6 ){
            if(DailHol == true){
                return "7:00";
            }
            else{
                return "10:00";
            }
        }
        else{
            if(DailHol == false){
                return "off";
            }
            else{
                return "10:00";
            }
        }
    }
}
//Task 3
class party{
    public int cond(int candy, int tea) {
        if ( candy >= 5 && tea >= 5 ){
            if ( candy*2 <= tea || tea*2 < candy ) {
                return 2;
            }
            else {
                return 1;
            }
        }
        else if ( candy < 5 || tea < 5){
            return 0;
        }
        else{
            return 0;
        }
    }
}
//Task 4

class lottery{
    int ab;
    int bc;
    int ca;
    public int sum(int a, int b, int c){
        ab = a + b;
        bc = b + c;
        ca = c + a;
        if( ab == 10 ){
            return 5;
        }
        else if( bc == 10 || ca == 10 ){
            return 10;
        }
        else{
            return 0;
        }
    }
}


