package library.model.implementation;

import library.model.AbstractCourseFactory;
import library.model.Grade;
import library.model.Person;

public class BasicCourseFactory extends AbstractCourseFactory {

    @Override
    public Person makeTeacher(String password, String name) {
        return new Teacher(password, name);
    }

    @Override
    public Person makeStudent(String password, String name) {
        return new Student(password, name);
    }

    @Override
    public Grade makeGrade(int value) {
        return new OralGrade(value);
    }
}
