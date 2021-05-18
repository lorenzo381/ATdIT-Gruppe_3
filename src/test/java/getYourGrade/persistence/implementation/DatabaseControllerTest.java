package getYourGrade.persistence.implementation;

import getYourGrade.model.implementation.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseControllerTest {

    @Test
    public void testCreateStudent() {
        DatabaseController.createTable();

        DatabaseController.createStudent(new StudentData(1, "Isaak", "Luca", "Programmieren", 2, 3));
        StudentData student = DatabaseController.get(1);

        assertEquals(student.getId(), 1);
        assertEquals(student.getLastName(), "Isaak");
        assertEquals(student.getFirstName(), "Luca");
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 3);

    }

    @Test
    public void testWriteGrade() {
        DatabaseController.createTable();

        DatabaseController.createStudent(new StudentData(1, "Isaak", "Luca", "Programmieren", 2, 3));

        DatabaseController.setGrade(1, 6);

        StudentData student = DatabaseController.get(1);

        assertEquals(student.getId(), 1);
        assertEquals(student.getLastName(), "Isaak");
        assertEquals(student.getFirstName(), "Luca");
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 6);
    }

    @Test
    public void testCreateAllStudents() {

        DatabaseController.createTable();

        DatabaseController.createStudent(new StudentData(1, "Isaak", "Luca", "Programmieren", 2, 3));
        DatabaseController.createStudent(new StudentData(2, "Lorenz", "Marco", "Programmieren", 2,2));
        DatabaseController.createStudent(new StudentData(3, "Schröder", "Laura", "Programmieren", 20,3));
        DatabaseController.createStudent(new StudentData(4, "Müller", "Tim", "Programmieren", 0,2));
        DatabaseController.createStudent(new StudentData(5, "Ibrahimovic", "Zlatan",  "Programmieren", 37,4));
        DatabaseController.createStudent(new StudentData(6, "Schulz", "Mauritz",  "Programmieren", 1,5));
        DatabaseController.createStudent(new StudentData(7, "Schulz", "Lara",  "Programmieren", 1,2));
        DatabaseController.createStudent(new StudentData(8, "Jamin", "Jonas",  "Programmieren", 4,1));
        DatabaseController.createStudent(new StudentData(9, "Lefrank", "Maxim",  "Programmieren", 30,2));
        DatabaseController.createStudent(new StudentData(10, "Stefan", "Tom",  "Programmieren", 12,5));
        DatabaseController.createStudent(new StudentData(11, "Kirchner", "Phillip",  "Programmieren", 7,3));
        DatabaseController.createStudent(new StudentData(12, "Platte", "Noah",  "Programmieren", 15,1));
        DatabaseController.createStudent(new StudentData(13, "Hörcher", "Robert",  "Programmieren", 27,1));
        DatabaseController.createStudent(new StudentData(14, "Spahn", "Clara",  "Programmieren", 2,2));
        DatabaseController.createStudent(new StudentData(15, "Lerchenberger", "Sofia",  "Programmieren", 0,1));


    }


}
