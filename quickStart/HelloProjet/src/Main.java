import org.junit.Test;

public class Main {

    @Test
    public void testHelloWrold() {
//        System.out.println("HelloWorld!");

        double a = 1.5;
        for (int i = 0; i < 20; i++) {
            double b = 1 + 1/Math.pow(a,2);
            System.out.println(b);
            a = b;
        }

    }

    @Test
    public void testHelloWrold2() {
//        System.out.println("HelloWorld!");

        double a = 1.5;
        for (int i = 0; i < 20; i++) {
            double b = Math.pow(1 + Math.pow(a,2), 1.0/3.0);
            System.out.println(b);
            a = b;
        }

    }

    @Test
    public void testHelloWrold3() {
//        System.out.println("HelloWorld!");

        double a = 1.5;
        for (int i = 0; i < 20; i++) {
            double b = 1/(Math.sqrt(a-1));
            System.out.println(b);
            a = b;
        }

    }
}
