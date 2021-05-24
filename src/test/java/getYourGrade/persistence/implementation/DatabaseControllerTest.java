package getYourGrade.persistence.implementation;

import getYourGrade.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The class DatabaseControllerTest checks the class DatabaseController for its correct functionality.
 *
 * @version : 24.05.2021
 * @author: Jonas Jamin
 **/

public class DatabaseControllerTest {


    /**
     * Creates an entry in the database with particular values in each column and checks for its actual existence and correctness afterwards
     * to demonstrate full functionality and eventually investigate upcoming errors of the createStudent method based in the class DatabaseController.
     **/
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

    /**
     * Creates a change of value of a grade for a specific entry (student) and checks for the actual value of grade afterwards, expecting the ordered value.
     * Made to demonstrate full functionality and eventually investigate upcoming errors of the setGrade method based in the class DatabaseController.
     **/
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
