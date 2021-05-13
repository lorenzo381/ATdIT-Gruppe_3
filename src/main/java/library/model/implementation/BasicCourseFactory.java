package library.model.implementation;

import library.model.AbstractCourseFactory;
import library.model.Grade;
import library.model.Person;

public class BasicCourseFactory extends AbstractCourseFactory {

    @Override
    public Person makeTeacher(String password, String lastname, String firstname) {
        return new Teacher(password, lastname, firstname);
    }

    @Override
    public Person makeStudent(String password, String lastname, String firstname) {
        return new Student(password, lastname, firstname);
    }

    @Override
    public Grade makeGrade(int value) {
        return new OralGrade(value);
    }
}
