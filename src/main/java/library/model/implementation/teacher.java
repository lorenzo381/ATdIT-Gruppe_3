package library.model.implementation;

import library.model.person;

import java.util.Date;

import java.util.Objects;

public class teacher implements person {

    private final int id;
    private final String name;
    private Date birthday;

    //teachers' id space >1000
    public static int nextId = 1000;

    public teacher(String name, Date birthday) {
        this.id = nextId++;
        this.name = name;
        this.birthday = birthday;
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
    public String getBirthday() {
        return this.birthday.toString();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
}
