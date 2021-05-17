package getYourGrade.model.implementation;

import getYourGrade.model.BasicStudent;
import getYourGrade.persistence.implementation.StudentData;

import java.util.Objects;

public class Student implements BasicStudent {

    private int id;
    private String firstName;
    private /*final*/ String lastName;
    private String courseName;
    private int missedDays;
    private int grade;

    public Student(StudentData studentData) {
        this.id = studentData.getId();
        this.lastName = studentData.getLastName();
        this.firstName = studentData.getFirstName();
        this.courseName = studentData.getCourseName();
        this.missedDays = studentData.getMissedDays();
        this.grade = studentData.getGrade();
    }

    public Student(int id, String lastName, String firstName, String courseName, int missedDays, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
    @Override
    public String getFirstName() {
        return this.firstName;
    }


    public String getCourseName() {
        return this.courseName;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public int getGrade() { return this.grade;}

    public void resetMissedDays() {
        this.missedDays = 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
