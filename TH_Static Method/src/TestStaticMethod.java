public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(444, "Trang");
        Student s2 = new Student(443, "Anh");
        Student s3 = new Student(333, "Dan");

        //calling display method
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }

}
