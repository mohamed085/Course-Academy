package Controller;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        StudentController studentController=new StudentController();
        Scanner input = new Scanner(System.in);
        int c = 1;
        while (c != 0) {
            System.out.print("Enter 1 to enter to student\n");

            System.out.print("Please Enter 0 to exist\n");
            System.out.print("Please Enter choice : ");
            c = input.nextInt();
            System.out.println("-------------------------------------------------------------------------");
            switch (c) {
                case 0:
                    System.exit(0);
                case 1:
                    studentController.studentConsole();
                    break;
                default:
                    System.out.println("Your choice wrong");
                    return;
            }
        }
    }
}