package library.persistence.implementation;

import library.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseControllerTest {

    @Test
    public void testCreateStudent(){
       DatabaseController.createTable();

        DatabaseController.createStudent(new Student(1, "Isaak", "Luca", 2,"Programmieren" , 2, 3));
        StudentData student = DatabaseController.get(1);

        assertEquals(student.getId(), 1);
        assertEquals(student.getLastName(), "Isaak");
        assertEquals(student.getFirstName(), "Luca");
        assertEquals(student.getFrequency(), 2);
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 3);
    }

    @Test
    public void testWriteGrade(){
        DatabaseController.createTable();

        DatabaseController.createStudent(new Student(1, "Isaak", "Luca", 2,"Programmieren" , 2, 2));
        DatabaseController.setGrade(3);
        StudentData student = DatabaseController.get(1);

        assertEquals(student.getId(), 1);
        assertEquals(student.getLastName(), "Isaak");
        assertEquals(student.getFirstName(), "Luca");
        assertEquals(student.getFrequency(), 2);
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 3);
    }


}
