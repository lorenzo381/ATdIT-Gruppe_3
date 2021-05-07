package library.model.implementation;

import library.model.AbstractCourseFactory;
import library.model.Grade;
import library.model.Person;

public class BasicCourseFactory extends AbstractCourseFactory {

    @Override
    public Person makeTeacher(String name) {
        return new Teacher(name);
    }

    @Override
    public Person makeStudent(String name) {
        return null;
    }
    @Override
    public Grade makeGrade(int value) {
        return null;
    }
}
