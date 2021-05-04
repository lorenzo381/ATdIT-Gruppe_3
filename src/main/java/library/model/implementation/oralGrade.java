package library.model.implementation;

import library.model.grade;

import java.util.Date;

import java.util.Objects;

public class oralGrade implements grade {

    private int value;
    private Date date;

    public oralGrade(int value, Date date) {
        this.value = value;
        this.date = date;
    }

    @Override
    public int getValue(){
        return this.value;
    }

    @Override
    public String getDate() {
        return this.date.toString();
    }
}
