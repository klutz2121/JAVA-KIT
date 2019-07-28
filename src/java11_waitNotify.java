// Collection: is group of class and object
// How to get your data-structure as good as possible
/*STACK : LIFO = Last in first Out
* QUEUE : FIFO = First in First Out
* LIST : array which can store the address of data members,creating duplicate value Eg: Sae=me name can't be access
* TREE : Duplicate is possible in TREE also and the address
* Duplicate value is the value which can be differentiated*/
// Remove : delete only one data
// Delete : delete the whole data
/*public class java11_waitNotify {
    public static void main(String[] args) {
        food obj1 = new food();
        new Thread(){
            public void run(){
                obj1.buy();
            }
        }.start();
        new Thread(){
            public void run(){
                obj1.borrow(2);
            }
        }.start();
    }
}
class food{
    int money = 1;
    synchronized void buy(){
        System.out.println("want to buy hotdog");
        System.out.println("My own pocket: 1£");
        System.out.println("I would like to buy a hot dog");
        System.out.println("Cost : 3£");
        System.out.println("not enough money, so i'm going to borrow money from my friends");
        try{
            wait();
        }
        catch(Exception e) {
        }
        System.out.println("I have " + this.money + "£ for hot dog yay!");
    }
    synchronized void borrow(int money){
        int frimon = 3;
        System.out.println("My friend money then: " + frimon);
        frimon -= money;
        System.out.println("My friend money now: " + frimon);
        this.money += money;
        notify();
    }
}*/
import java.util.*;
class Main{
public static void main(String[]args){
        monster obj = new monster();
        new Thread(){
            public void run(){
                obj.kill(1500);
            }
        }.start();
        new Thread(){
            public void run(){
                obj.prayGod(500);
            }
        }.start();
    }
}
class monster{
    int monPow;
    int blessPow;
    int yourPow;
    String name;
    synchronized public void kill(int power){
        System.out.println("I have " + power);
        Scanner inp = new Scanner(System.in);
        this.yourPow = power;
        System.out.println("Please enter the monster power:");
        monPow = inp.nextInt();
        if( power < monPow ){
            System.out.println("I don't have enough power!!!");
            try{
                wait();
            }
            catch(Exception e){
            }
            power += this.blessPow;
            System.out.println("Current POWER: " + power);
            if( power >= monPow ) {
                System.out.println("VICTORY!!! I am inevitable");
            }
            else{
                System.out.println("OH NO DAMN IT");
            }
        }
        else{
            System.out.println("Victory!!! HAHA DAMN YOU MONSTER!!!");
        }
    }
    synchronized public void prayGod(int pow){
        if( this.yourPow < 1000 ){
            System.out.println("You are not fit to receive my power");
        }
        else{
            System.out.println("Here by the BLACK DRAGON KING");
            this.blessPow += pow;
        }
        notify();
    }
}
