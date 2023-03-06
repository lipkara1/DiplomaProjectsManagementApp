package service;

import model.Student;
import model.Subject;

import java.util.ArrayList;

public interface StudentService {
    public void saveProfile(Student student);
    public Student retrieveProfile(String profile);
    public ArrayList<Subject> listStudentSubjects();


    /* thelei allagh sta orismata*/
    public void applyToSubject(String name ,Integer price);


}
