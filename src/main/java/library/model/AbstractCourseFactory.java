package library.model;

import java.util.Date;

public interface AbstractCourseFactory {

    public static AbstractCourseFactory defaultInstance;

    public static AbstractCourseFactory get() {
        if(defaultInstance == null)
            throw new RuntimeException("Default AbstractCourseFactory was not instantiated");
        return defaultInstance;
    }

    public abstract Course makeCourse();
    public abstract Person makePerson(String name, Date birtbday);
    public abstract Grade makeGrade();
}
