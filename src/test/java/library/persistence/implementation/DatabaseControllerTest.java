package library.persistence.implementation;

import library.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseControllerTest {

    @Test
    public void testCreateStudent(){
        DatabaseController.tabelleanlegen();

        DatabaseController.createStudent(new Student(1, "Heribert", "prog5", 27 ));
        StudentData student = DatabaseController.get(1);

        assertEquals(student.getName(), "Heribert");
        assertEquals(student.getCourseName(), "prog5");
        assertEquals(student.getMissedDays(), 27);
    }
}
