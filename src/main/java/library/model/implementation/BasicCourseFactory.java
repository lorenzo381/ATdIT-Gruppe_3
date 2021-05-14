package library.model.implementation;

import library.model.AbstractCourseFactory;
import library.model.Grade;
import library.model.Person;

public class BasicCourseFactory extends AbstractCourseFactory {

    @Override
    public Person makeTeacher(String password, String lastName, String firstName) {
        return new Teacher(password, lastName, firstName);
    }

    @Override
    public Person makeStudent(String password, String lastName, String firstName) {
        return new Student(password, lastName, firstName);
    }

    @Override
    public Grade makeGrade(int value) {
        return new OralGrade(value);
    }
}
