import java.util.Scanner;

class DwarfException extends Exception{
    public DwarfException(String message){
        super(message);
    }
}
class ExceptionDemo {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter height: ");
            float ht;
            ht = sc.nextFloat();
            if(ht < 5.8f){
                throw new DwarfException("Your height is less than 5.8");
            }
            else{
                System.out.println("eligible for second round");
            }
        } catch(DwarfException d){
        System.out.println(d.getMessage());
        }
    }
}
