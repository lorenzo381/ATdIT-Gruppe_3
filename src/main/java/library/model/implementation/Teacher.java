package library.model.implementation;

import library.model.Person;

import java.util.Date;

import java.util.Objects;

public class Teacher implements Person {

    private final int id;
    private final String name;

    //teachers' id space >1000
    public static int nextId = 1000;

    public Teacher(String name) {
        this.id = nextId++;
        this.name = name;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
