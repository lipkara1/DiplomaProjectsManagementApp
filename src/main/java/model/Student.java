package model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "year_of_studies")
    private int yearOfStudies;

    @Column(name = "average_grade")
    private float currAverGrade;


    @Column(name = "number_courses")
    private int numberOfCourses;


    public Student() {

    }

    public Student(int id, String fullName, int yearOfStudies, float currAverGrade, int numberOfCourses) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfStudies = yearOfStudies;
        this.currAverGrade = currAverGrade;
        this.numberOfCourses = numberOfCourses;
    }

    public Student(String fullName, int yearOfStudies, float currAverGrade, int numberOfCourses) {
        this.fullName = fullName;
        this.yearOfStudies = yearOfStudies;
        this.currAverGrade = currAverGrade;
        this.numberOfCourses = numberOfCourses;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getCurrAverGrade() {
        return currAverGrade;
    }

    public void setCurrAverGrade(float currAverGrade) {
        this.currAverGrade = currAverGrade;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", yearOfStudies=" + yearOfStudies +
                ", currAverGrade=" + currAverGrade +
                ", numberOfCourses=" + numberOfCourses +
                '}';
    }
}
