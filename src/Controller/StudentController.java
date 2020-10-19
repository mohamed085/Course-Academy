package Controller;

import java.util.Scanner;

public class StudentController {





    public void studentConsole(){
        StudentController studentController=new StudentController();
        int c=1;
        Scanner input=new Scanner(System.in);
        while(c!=0) {
            while (c != 0) {



                System.out.println("Please Enter 0 to exist\n");
                System.out.print("Please Enter choice : ");
                c = input.nextInt();
                System.out.println("-------------------------------------------------------------------------");
                switch (c) {
                    case 0:
                        System.exit(0);



                    default:
                        System.out.println("Your choice wrong");
                        return;
                }
            }
        }
    }
}

