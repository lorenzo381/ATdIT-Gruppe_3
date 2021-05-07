package library.model.implementation;

import library.model.Grade;

import java.util.Date;

public class OralGrade implements Grade {

    private int value;
    private Date date;

    public OralGrade(int value) {
        this.value = value;
        this.date = new Date();
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
