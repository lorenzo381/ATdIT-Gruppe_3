package library.model.implementation;

import library.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Objects;

public class Student implements Person {

    private /*final*/ int id;
    private /*final*/ String password;
    private /*final*/ String name;
    private String courseName;
    private int missedDays;
    private OralGrade[] oralGrades;
    private double averageGrade;
    private int frequency;

    //students' id space
    public static int nextId = 0;

    public Student(String password, String name) {
        this.id = nextId++;
        this.password = password;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = 0;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;
    }

    public Student(String password, String name, String courseName) {
            this.id = nextId++;
            this.password = password;
            this.name = name;
            this.courseName = courseName;
            this.missedDays = 0;
            this.oralGrades = new OralGrade[100];
            this.frequency = 0;
    }

    public Student(int id, String name, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;
    }

    public void setId(int id) {
        this.id = id;

    }
    public void setName(String name) {
        this.name = name;
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
    public String getName() {
        return this.name;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public int[] getOralGrades() {
        int[] grades = new int[this.oralGrades.length];
        for(int i = 0; i < this.oralGrades.length;  i++) {
            grades[i] = oralGrades[i].getValue();
        }
        return grades;
    }

    public double getAverageGrade() {
        double sum = 0;
        for(int i = 0; i < this.oralGrades.length;  i++) {
            sum += oralGrades[i].getValue();
        }
        return (double) sum/this.oralGrades.length;
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
