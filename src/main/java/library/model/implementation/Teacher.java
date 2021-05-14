package library.model.implementation;

import library.model.Person;

import java.util.Date;

import java.util.Objects;

public class Teacher implements Person {

    private final int id;
    private final String password;
    private String firstName;
    private String lastName;

    //teachers' id space >1000
    public static int nextId = 1000;

    public Teacher(String password, String lastName, String firstName) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
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
        return this.getLastName();
    }

    @Override
    public String getFirstName() {
        return this.getFirstName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
