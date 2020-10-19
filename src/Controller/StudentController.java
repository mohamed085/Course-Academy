package Controller;

import Model.Student;
import Services.StudentServices;
import ServicesImp.StudentServicesImp;

import java.util.Scanner;

public class StudentController {

    StudentServices studentServices;
    Student student;
    Scanner input=new Scanner(System.in);



    public void  searchByName(){
        studentServices=new StudentServicesImp();
        System.out.print("Enter name : ");
        String name=input.nextLine();
        studentServices.searchByName(name);
    }

    public void searchByPhone(){
        studentServices=new StudentServicesImp();
        System.out.print("Enter phone : ");
        String phone=input.nextLine();
        studentServices.searchByPhone(phone);

    }



    public void studentConsole(){
        StudentController studentController=new StudentController();
        int c=1;
        Scanner input=new Scanner(System.in);
        while(c!=0) {
            while (c != 0) {


                System.out.print("Please Enter 9 to search by student name \n");
                System.out.print("Please Enter 10 to search by student phone \n");




                System.out.println("Please Enter 0 to exist\n");
                System.out.print("Please Enter choice : ");
                c = input.nextInt();
                System.out.println("-------------------------------------------------------------------------");
                switch (c) {
                    case 0:
                        System.exit(0);

                    case 9:
                        studentController.searchByName();
                        break;
                    case 10:
                        studentController.searchByPhone();
                        break;


                    default:
                        System.out.println("Your choice wrong");
                        return;
                }
            }
        }
    }
}

