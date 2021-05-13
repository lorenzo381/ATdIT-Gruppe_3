package library.model.implementation;

import library.model.Person;
import library.persistence.implementation.StudentData;

import java.util.Objects;

public class Student implements Person {

    private /*final*/ int id;
    private /*final*/ String password;
    private String firstname;
    private /*final*/ String lastname;
    private String courseName;
    private int missedDays;
    private OralGrade[] oralGrades;
    private double averageGrade;
    private int frequency;

    //students' id space
    public static int nextId = 0;

    public Student(StudentData studentData) {
        this.id = nextId++;
        this.password = studentData.getPassword();
        this.lastname = studentData.getLastname();
        this.firstname = studentData.getFirstname();

/*      TODO: Fix that
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;*/
    }

    public Student(String password, String lastname, String firstname) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;
    }
    public Student(String password, String lastname, String firstname, Integer frequency) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
    }

    public Student(String password, String lastname, String firstname, Integer frequency, String courseName) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
    }

    public Student(int id, String lastname, String firstname, Integer frequency, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    public void addFrequency() {
        this.frequency++;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }
    @Override
    public String getFirstname() {
        return this.firstname;
    }


    public String getCourseName() {
        return this.courseName;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public int[] getOralGrades() {
        int[] grades = new int[this.oralGrades.length];
        for (int i = 0; i < this.oralGrades.length; i++) {
            grades[i] = oralGrades[i].getValue();
        }
        return grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < this.oralGrades.length; i++) {
            sum += oralGrades[i].getValue();
        }
        return (double) sum / this.oralGrades.length;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void resetMissedDays() {
        this.missedDays = 0;
    }

    public void resetFrequency() {
        this.frequency = 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
