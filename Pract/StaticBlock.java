package Pract;
import static java.lang.System.*;
public class StaticBlock {
    static{
        System.out.println("Hello java !");
    }
    public static void main(String[] args) {
        out.println("Hello main !");
    }
    static{
        System.out.println("Bye Java");
    }
}
