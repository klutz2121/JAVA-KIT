import java.util.*;

public class javaHWcL {
    public static void main(String[] args) {
        ArrayList<upload> profile = new ArrayList<upload>();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the default length and numebr of pics");
        int l = inp.nextInt();
        int number = inp.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println("Enter the width of pic:");
            int width = inp.nextInt();
            System.out.println("Enter the length of pic:");
            int length = inp.nextInt();
            upload pic = new upload(width,length);
            profile.add(pic);
        }
        for(upload pro:profile){
            pro.check(l);
        }
    }
}
class upload{
    int width, length;
    public upload(int width, int length){
        this.width = width;
        this.length = length;
    }
    public void check(int l){
        if(this.width < l || this.length < l){
            System.out.println("Upload another");
        }
        else if(this.width == l && this.length == l){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Crop it");
        }
    }
}
