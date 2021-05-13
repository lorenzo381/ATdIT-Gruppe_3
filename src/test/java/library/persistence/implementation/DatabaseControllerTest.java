package library.persistence.implementation;

import library.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseControllerTest {

    @Test
    public void testCreateStudent(){
        DatabaseController.createTable();

        DatabaseController.createStudent(new Student(1, "Bruchhagen", "Heribert", 3,"BWL" , 27));
        StudentData student = DatabaseController.get(1);

        //assertEquals(student.getId(), 1);
        assertEquals(student.getLastname(), "Bruchhagen");
        assertEquals(student.getFirstname(), "Heribert");
        assertEquals(student.getFrequency(), 3);
        assertEquals(student.getCourseName(), "BWL");
        assertEquals(student.getMissedDays(), 27);
    }
}
