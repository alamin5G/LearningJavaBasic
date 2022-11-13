package ClassObject;

public class Student {
    private int sId;
    private double cgpa;
    private String name;
    private String phone;
    private String dept;

    void display(){
        System.out.println(name);
        System.out.println(sId);
        System.out.println(dept);
        System.out.println(cgpa);
        System.out.println(phone);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args){

        Student student1 = new Student();
        System.out.println("Student Information: ");
        student1.name   = "Md. Alamin";
        student1.sId    = 21303134;
        student1.dept   = "CSE";
        student1.cgpa   = 3.71;
        student1.phone  = "+8801822679672";

        Student student2 = new Student();
        student2.name   = "Md. Rakib";
        student2.sId    = 21303134;
        student2.dept   = "CSE";
        student2.cgpa   = 3.83;
        student2.phone  = "+8801822679672";


        student1.display();
        student2.display();
    }
}
