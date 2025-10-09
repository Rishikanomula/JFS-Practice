public class StudentData {
    int rollno;
    String name;
    float avg;
    StudentData(){}
    StudentData(int r, String n, float avg){
        this.rollno=r;
        this.name=n;
        this.avg=avg;
    }
    public String toString(){
        return "Roll number: "+rollno+"\nName: "+name+"\nAverage: "+avg;
    }
}
class StudentDataDemo{
    public static void main(String[] args) {
        StudentData d = new StudentData(509,"akshaya",8.6f);
        System.out.println(d);
    }

}
