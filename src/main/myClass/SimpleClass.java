
import java.util.Random;
import java.lang.Class;



public class SimpleClass {

    public static void main(String[] args) {

        Random r = new Random();
        int ran = r.nextInt();

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int x = m + n;
        System.out.println(x);
        System.out.println(r);
        System.out.println(ran);
        System.out.println(Math.abs(ran));
        int b = firstint(n);
        System.out.println(b);
        SecondClass c = new SecondClass();
        System.out.println(c.getClass().getName());
        c.first();
        System.out.println(c.second());
    }

    public static int firstint(int a) {

        return (int) (2 * a);
        }
}


