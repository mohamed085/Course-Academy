package ServicesImp;

import DAO.StudentDAO;
import Services.StudentServices;

public class StudentServicesImp implements StudentServices {
    StudentDAO studentDAO;

    @Override
    public void deleteStudent(String username) {
        studentDAO=new StudentDAO();
        studentDAO.deleteStudent(username);
    }

}
