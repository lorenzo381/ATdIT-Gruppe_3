package library.model.implementation;

import library.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Objects;

public class Student implements Person {

    private /*final*/ int id;
    private /*final*/ String name;
    private String courseName;
    private int missedDays;
    private WrittenGrade[] writtenGrades;
    private OralGrade[] oralGrades;
    private int frequency;

    //students' id space
    public static int nextId = 0;

    public Student(String name) {
        this.id = nextId++;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = 0;
        this.writtenGrades = new WrittenGrade[100];
        this.oralGrades = new OralGrade[100];
        this.frequency = 0;
    }

    public Student() {


    }
public Student(int id, String name, String courseName, int missedDays){
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = missedDays;
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

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addToCourse( String CourseName ) {
        this.courseName = courseName;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public void addFrequency() {
        this.frequency++;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void resetFrequency() {
        this.frequency = 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
