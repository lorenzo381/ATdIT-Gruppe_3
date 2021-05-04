package library.model.implementation;

import library.model.person;

import java.util.Date;

import java.util.Objects;

public class student implements person {

    private final int id;
    private final String name;
    private Date birthday;
    private String courseName;
    private int missedDays;

    //students' id space
    public static int nextId = 0;

    public student(int id, String name, Date birthday, String courseName) {
        this.id = nextId++;
        this.name = name;
        this.birthday = birthday;
        this.courseName = courseName;
        this.missedDays = 0;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthday() {
        return this.birthday.toString();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
