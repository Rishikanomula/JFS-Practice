package Pract;

public class A {
    int i;
    static int j;
    A(){
        i+=5;
        j+=5;
    }
    A(int i, int j){
        this.i += i;
        this.j += j;
    }
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(1,2);
        A obj3 = new A();
        A obj4 = new A(3,4);
        System.out.println("i= "+obj4.i);
        System.out.println("j= "+obj4.j);
    }
}
