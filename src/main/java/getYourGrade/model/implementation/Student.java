package getYourGrade.model.implementation;

import getYourGrade.model.BasicStudent;
import getYourGrade.persistence.implementation.StudentData;

public class Student implements BasicStudent {

    private final int ID;
    private final String FIRSTNAME;
    private final String LASTNAME;
    private String courseName;
    private int missedDays;
    private int grade;

    public Student(StudentData studentData) {
        this.ID = studentData.getID();
        this.LASTNAME = studentData.getLASTNAME();
        this.FIRSTNAME = studentData.getFIRSTNAME();
        this.courseName = studentData.getCourseName();
        this.missedDays = studentData.getMissedDays();
        this.grade = studentData.getGrade();
    }

    public Student(int ID, String LASTNAME, String FIRSTNAME, String courseName, int missedDays, int grade) {
        this.ID = ID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    public int getID() {
        return this.ID;
    }

    public String getLASTNAME() {
        return this.LASTNAME;
    }

    public String getFIRSTNAME() {
        return this.FIRSTNAME;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public int getGrade() { return this.grade;}

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void resetMissedDays() {
        this.missedDays = 0;
    }
}
