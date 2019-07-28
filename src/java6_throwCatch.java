public class java6_throwCatch {
    public static void main(String[] args) {
        int a = 45, b = 0, res;
        try {
            if (b == 0) {
                throw (new ArithmeticException("Can't divide by zero"));
            } else {
                res = a / b;
                System.out.println("\n\t The result is : " + res);
            }
        } catch (ArithmeticException Ex) {
            System.out.println("\n\t error : " + Ex.getMessage());
        }
        System.out.println("\n\t The end!!! ");
    }
}
