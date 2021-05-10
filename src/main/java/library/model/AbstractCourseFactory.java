package library.model;

import library.model.implementation.Teacher;

public abstract class AbstractCourseFactory {

    public static AbstractCourseFactory defaultInstance;

    public static AbstractCourseFactory get() {
        if(defaultInstance == null)
            throw new RuntimeException("Default AbstractCourseFactory was not instantiated");
        return defaultInstance;
    }

    public abstract Person makeStudent(String password, String name);
    public abstract Person makeTeacher(String password, String name);
    public abstract Grade makeGrade(int value);
}