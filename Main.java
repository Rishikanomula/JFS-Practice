//Q1:

/*class MCQ{
    public static void  main(String[] args){
        int x=100, y=200;
        System.out.printf("%1$5d\tr%1$5d\t%2$5d\t%1$5d",x,y);
    }
}*/

//Q2:

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class Main{
    public static void main(String args[]){
        Animal a = new Dog();
        a.makeSound();
    }
}