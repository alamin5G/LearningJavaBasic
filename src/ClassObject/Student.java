package ClassObject;

public class Student {
    protected int sId;
    protected double cgpa;
    protected String name;
    protected String phone;
    protected String dept;

    void display(){
        System.out.println(name);
        System.out.println(sId);
        System.out.println(dept);
        System.out.println(cgpa);
        System.out.println(phone);
        System.out.println("----------------------------------");
    }


}
