package ServicesImp;

import DAO.StudentDAO;
import Services.StudentServices;

public class StudentServicesImp implements StudentServices {
    StudentDAO studentDAO;

    @Override
    public void displayAllStudent() {
        studentDAO=new StudentDAO();
        studentDAO.displayAllStudent();
    }
}
