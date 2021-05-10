package library.model.implementation;

import library.model.Person;

import java.util.Date;

import java.util.Objects;

public class Teacher implements Person {

    private final int id;
    private final String password;
    private final String name;

    //teachers' id space >1000
    public static int nextId = 1000;

    public Teacher(String password, String name) {
        this.id = nextId++;
        this.password = password;
        this.name = name;
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

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
