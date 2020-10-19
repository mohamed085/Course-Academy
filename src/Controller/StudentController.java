package Controller;

import Model.Student;
import Services.StudentServices;
import ServicesImp.StudentServicesImp;

import java.util.Scanner;

public class StudentController {

    StudentServices studentServices;
    Student student;
    Scanner input=new Scanner(System.in);


    public void displayAllStudent(){
        studentServices=new StudentServicesImp();
        studentServices.displayAllStudent();
    }




    public void studentConsole(){
        StudentController studentController=new StudentController();
        int c=1;
        Scanner input=new Scanner(System.in);
        while(c!=0) {
            while (c != 0) {

                System.out.print("Please Enter 8 to display all student \n");


                System.out.println("Please Enter 0 to exist\n");
                System.out.print("Please Enter choice : ");
                c = input.nextInt();
                System.out.println("-------------------------------------------------------------------------");
                switch (c) {
                    case 0:
                        System.exit(0);

                    case 8:
                        studentController.displayAllStudent();
                        break;


                    default:
                        System.out.println("Your choice wrong");
                        return;
                }
            }
        }
    }
}

