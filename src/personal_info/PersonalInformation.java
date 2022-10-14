package personal_info;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // to consume the \n
        System.out.println("Enter your University: ");
        String university = input.nextLine();

        System.out.println("Hello," + name + ". You are " + age + " years old and you are" +
                " studying in "+university);

    }
}
