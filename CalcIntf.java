public interface CalcIntf {
    void add(int x, int y); // abstract method
    void sub(int x,int y); // abstract method
    void mul(int x,int y); // abstract method
    void div(int x, int y); // abstract method
    public static void const_data(){ // static method 
        System.out.println("\npi="+Math.PI);
    }
    default void check(){ // default method
        System.out.println("Default method");
    }
} 
class CalcIntfDemo implements CalcIntf{
    public void add(int x,int y){
        System.out.println("sum: "+(x+y));
    }
    public void sub(int x,int y){
        System.out.println("Sub: "+(x-y));
    }
    public void mul(int x, int y){
        System.out.println("Mul: "+(x*y));
    }
    public void div(int x, int y){
        System.out.printf("Div: %.2f\n",(x/(float)y));
    }

    public static void main(String[] args){
        CalcIntf obj = new CalcIntfDemo();
        obj.add(7, 5);
        obj.sub(7,5);
        obj.mul(7,5);
        obj.div(7, 5);
        CalcIntf.const_data();
        obj.check();
    }
}
