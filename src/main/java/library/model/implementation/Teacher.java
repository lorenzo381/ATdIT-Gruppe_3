package library.model.implementation;

import library.model.Person;

import java.util.Date;

import java.util.Objects;

public class Teacher implements Person {

    private final int id;
    private final String password;
    private String firstname;
    private String lastname;

    //teachers' id space >1000
    public static int nextId = 1000;

    public Teacher(String password, String lastname, String firstname) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
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
    public String getLastname() {
        return this.getLastname();
    }

    @Override
    public String getFirstname() {
        return this.getFirstname();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
