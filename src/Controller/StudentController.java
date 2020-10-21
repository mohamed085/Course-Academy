package Controller;

import Model.Student;
import Services.StudentServices;
import ServicesImp.StudentServicesImp;

import java.util.Scanner;

public class StudentController {
    StudentServices studentServices;
    Student student;
    Scanner input=new Scanner(System.in);


    public void deleteStudent(){
        studentServices=new StudentServicesImp();
        System.out.print("Enter username : ");
        String username=input.nextLine();
        studentServices.deleteStudent(username);
    }


    public void addStudent(){
        student = new Student();
        studentServices=new StudentServicesImp();
        System.out.print("Add username : ");
        student.setUsername(input.nextLine());
        System.out.print("Add password : ");
        student.setPassword(input.nextLine());
        System.out.print("Add name : ");
        student.setName(input.nextLine());
        System.out.print("Add mail : ");
        student.setMail(input.nextLine());
        System.out.print("Add phone : ");
        student.setPhone(input.nextLine());
        System.out.print("Add balance : ");
        student.setBalance(input.nextDouble());
        studentServices.addStudent(student);
    }




    public void studentConsole(){
        StudentController studentController=new StudentController();
        int c=1;
        Scanner input=new Scanner(System.in);
        while(c!=0) {
            while (c != 0) {

                System.out.print("Please Enter 7 to delete student \n");
                System.out.print("Please Enter 1 to add new student\n");


                System.out.println("Please Enter 0 to exist\n");
                System.out.print("Please Enter choice : ");
                c = input.nextInt();
                System.out.println("-------------------------------------------------------------------------");
                switch (c) {
                    case 0:
                        System.exit(0);
                    case 1:
                        studentController.addStudent();
                        break;
                    case 7:
                        studentController.deleteStudent();
                        break;
                    default:
                        System.out.println("Your choice wrong");
                        return;
                }
            }
        }
    }
}

