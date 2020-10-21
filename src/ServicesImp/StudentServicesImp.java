package ServicesImp;

import Services.StudentServices;

public class StudentServicesImp implements StudentServices {
    StudentDAO studentDAO;

    @Override
    public void deleteStudent(String username) {
        studentDAO = new StudentDAO();
        studentDAO.deleteStudent(username);
    }
    @Override
        public void addStudent(Student student) {
        studentDAO = new StudentDAO();
        studentDAO.insertStudent(student);
    }


    @Override
    public void updateStudent(String username, Student newStudent) {
        studentDAO = new StudentDAO();
        studentDAO.updateStudent(username, newStudent);
    }

    @Override
    public void updateStudentName(String username, String newName) {
        studentDAO = new StudentDAO();
        studentDAO.updateStudentName(username, newName);
    }

    @Override
    public void updateStudentPassword(String username, String newPassword) {
        studentDAO = new StudentDAO();
        studentDAO.updateStudentPassword(username, newPassword);
    }

    @Override
    public void updateStudentMail(String username, String newMail) {
        studentDAO = new StudentDAO();
        studentDAO.updateStudentMail(username, newMail);
    }

    @Override
    public void updateStudentPhone(String username, String newPhone) {
        studentDAO = new StudentDAO();
        studentDAO.updateStudentPhone(username, newPhone);
    }

}
