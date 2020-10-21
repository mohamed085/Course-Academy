package ServicesImp;

import DAO.StudentDAO;
import Model.Student;
import Services.StudentServices;

public class StudentServicesImp implements StudentServices {
    StudentDAO studentDAO;

    @Override
    public void addStudent(Student student) {
        studentDAO = new StudentDAO();
        studentDAO.insertStudent(student);
    }

}
