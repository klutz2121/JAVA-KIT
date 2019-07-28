class cl5 {
    int a;
    String b;
    float c;

    cl5(int a, String b, float c) {
        /*a = a;    // without "this" keywords the args won't be passed and print
        b = b;      // "this" specify for current operation
        c = c;*/    // "this" is used for differentiate between same var
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void display() {
        System.out.println(a + " " + b + " " + c);
    }
}
class testThis1{
    public static void main(String[] args) {
        cl5 s1 = new cl5(1,"Grammonde",5f);
        cl5 s2 = new cl5(2,"Vermillion",6f);
        s1.display();
        s2.display();
    }
}
