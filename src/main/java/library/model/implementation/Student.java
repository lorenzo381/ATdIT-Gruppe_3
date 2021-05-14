package library.model.implementation;

import library.model.Person;
import library.persistence.implementation.StudentData;

import java.util.Objects;

public class Student implements Person {

    private /*final*/ int id;
    private /*final*/ String password;
    private String firstName;
    private /*final*/ String lastName;
    private String courseName;
    private int missedDays;
    private OralGrade[] oralGrades;
    private double averageGrade;
    private int frequency;
    private int grade;

    //students' id space
    public static int nextId = 0;

    public Student(StudentData studentData) {
        this.id = nextId++;
        this.password = studentData.getPassword();
        this.lastName = studentData.getLastName();
        this.firstName = studentData.getFirstName();

/*      TODO: Fix that
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;*/
    }

    public Student(String password, String lastName, String firstName) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;
    }

    public Student(String password, String lastName, String firstName, Integer frequency, int grade) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
        this.grade = grade;
    }

    public Student(String password, String lastName, String firstName, Integer frequency, String courseName, int grade) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
        this.grade = grade;
    }

    public Student(int id, String lastName, String firstName, Integer frequency, String courseName, Integer missedDays, Integer grade) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
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

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

    public int getFrequency() {
        return this.frequency;
    }

    public int getGrade() { return this.grade;};

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
