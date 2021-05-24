package getYourGrade.persistence.implementation;

import getYourGrade.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseControllerTest {

//Run JUnit tests individually

    @Test
    public void testCreateStudent() {
        DatabaseController.clearTable();
        DatabaseController.createTable();

        DatabaseController.createStudent(new StudentData(1, "Isaak", "Luca", "Programmieren", 2, 3));
        StudentData student = DatabaseController.get(1);

        assertEquals(student.getID(), 1);
        assertEquals(student.getLASTNAME(), "Isaak");
        assertEquals(student.getFIRSTNAME(), "Luca");
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 3);


    }

    @Test
    public void testSetGrade() {
        DatabaseController.clearTable();
        DatabaseController.createTable();

        DatabaseController.createStudent(new StudentData(1, "Isaak", "Luca", "Programmieren", 2, 3));

        DatabaseController.setGrade(1, 6);

        StudentData student = DatabaseController.get(1);

        assertEquals(student.getID(), 1);
        assertEquals(student.getLASTNAME(), "Isaak");
        assertEquals(student.getFIRSTNAME(), "Luca");
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 6);

        DatabaseController.clearTable();
    }

}
