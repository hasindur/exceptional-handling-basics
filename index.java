public class index {

    public static void main(String[] args) {
        int a, b, c;
        a = 34;
        b = 0;

        System.out.println("Start");
        try {
            c = a / b;
        } catch (ArithmeticException exception) {
            c = -1;
        }

        System.out.println("Answer : " + c);
        System.out.println("End");
    }
}