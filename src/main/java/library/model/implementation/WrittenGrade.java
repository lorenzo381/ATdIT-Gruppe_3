package library.model.implementation;

import library.model.Grade;

import java.util.Date;

public class WrittenGrade implements Grade {

    int value;
    Date date;

    public WrittenGrade(int value) {
        this.value = value;
        this.date = new Date();
    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public String getDate() {
        return this.date.toString();
    }
}
