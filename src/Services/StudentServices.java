package Services;

import Model.Student;

public interface StudentServices {

    public void updateStudent(String username , Student newStudent);
    public void updateStudentName(String username,String newName);
    public void updateStudentPassword(String username,String newPassword);
    public void updateStudentMail(String username,String newMail);
    public void updateStudentPhone(String username,String newPhone);
    public void deleteStudent(String username);
    public void addStudent(Student student);

}
