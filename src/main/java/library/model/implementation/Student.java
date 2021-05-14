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
    public Student(String password, String lastName, String firstName, Integer frequency) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
    }

    public Student(String password, String lastName, String firstName, Integer frequency, String courseName) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
    }

    public Student(int id, String lastName, String firstName, Integer frequency, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.oralGrades = new OralGrade[100];
        this.frequency = frequency;
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
