package ServicesImp;

import DAO.StudentDAO;
import Services.StudentServices;

public class StudentServicesImp implements StudentServices {
    StudentDAO studentDAO;

    @Override
    public void searchByName(String name) {
        studentDAO=new StudentDAO();
        studentDAO.searchByName(name);
    }

    @Override
    public void searchByPhone(String phone) {
        studentDAO=new StudentDAO();
        studentDAO.searchByPhone(phone);
    }

}
