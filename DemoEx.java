//Interview Questions asked for our seniors 
//Q1:

/*class MCQ{
    public static void  main(String[] args){
        int x=100, y=200;
        System.out.printf("%1$5d\tr%1$5d\t%2$5d\t%1$5d",x,y);
    }
}*/

//Q2:

// class Animal{
//     void makeSound(){
//         System.out.println("Animal makes a sound");
//     }
// }
// class Dog extends Animal{
//     void makeSound(){
//         System.out.println("Dog barks");
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Animal a = new Dog();
//         a.makeSound();
//     }
// }

//Q3:

// abstract class Parent{
//     abstract void show(); //asbtract method should'nt have body (i.e they should'nt have any code within them no "{}" brackets)
// }
// class Child extends Parent{
//     void show(){
//         System.out.println("Child class method!");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Parent p = new Child();
//         p.show();
//     }
// }


//Q4:

// abstract class demo{
//     public int a;
//     demo(){
//         a=10;
//     }
//     abstract public void set();
//     abstract public void get();
// }
// class Test extends demo{
//     public void set(int a){
//         this.a=a;
//     }
//     final public void get(){
//         System.out.println("a = "+a);
//     }
//     public static void main(String[] args){
//         Test obj = new Test();
//         obj.set(20);
//         obj.get();
//     }
// }

//Q7:
// class Demo{
//     int num;
//     Demo(){
//         this(100);
//         System.out.println("Default Constructor");
//     }
//     Demo(int n){
//         num = n;
//         System.out.println("Parameterized Constructor");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//     }
// }

// Q8:
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
public class DemoEx{
    public static void main(String[] args) {
        try{
            throw new CustomException("Custom error occured");
        } catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}

