public class Student {
    private String name;
    private int rollno;
    private  static String college ="BBDIT";
    public Student(){

    }
    public Student (int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    public void displayStudent(){
        System.out.println(rollno + " " + name + " " + college);

    }
}
