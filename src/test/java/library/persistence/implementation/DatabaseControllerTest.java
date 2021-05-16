package library.persistence.implementation;

import library.model.implementation.Student;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DatabaseControllerTest {

    @Test
    public void testCreateStudent() {
        DatabaseController.createTable();

        DatabaseController.createStudent(new Student(1, "Isaak", "Luca", 2, "Programmieren", 2, 3));
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
    public void testWriteGrade() {

        DatabaseController.setGrade(5, 3);

        StudentData student = DatabaseController.get(5);

        assertEquals(student.getId(), 1);
        assertEquals(student.getLastName(), "Isaak");
        assertEquals(student.getFirstName(), "Luca");
        assertEquals(student.getFrequency(), 2);
        assertEquals(student.getCourseName(), "Programmieren");
        assertEquals(student.getMissedDays(), 2);
        assertEquals(student.getGrade(), 3);
    }

    @Test
    public void testCreateAllStudents() {

        DatabaseController.createTable();

        DatabaseController.createStudent(new Student(1, "Isaak", "Luca", 2, "Programmieren", 2, 3));
        DatabaseController.createStudent(new Student(2, "Lorenz", "Marco", 2, "Programmieren", 2,2));
        DatabaseController.createStudent(new Student(3, "Schröder", "Laura", 0, "Programmieren", 20,3));
        DatabaseController.createStudent(new Student(4, "Müller", "Tim", 10, "Programmieren", 0,2));
        DatabaseController.createStudent(new Student(5, "Ibrahimovic", "Zlatan", 1, "Programmieren", 37,4));
        DatabaseController.createStudent(new Student(6, "Schulz", "Mauritz", 9, "Programmieren", 1,5));
        DatabaseController.createStudent(new Student(7, "Schulz", "Lara", 17, "Programmieren", 1,2));
        DatabaseController.createStudent(new Student(8, "Jamin", "Jonas", 3, "Programmieren", 4,1));
        DatabaseController.createStudent(new Student(9, "Lefrank", "Maxim", 1, "Programmieren", 30,2));
        DatabaseController.createStudent(new Student(10, "Stefan", "Tom", 2, "Programmieren", 12,5));
        DatabaseController.createStudent(new Student(11, "Kirchner", "Phillip", 6, "Programmieren", 7,3));
        DatabaseController.createStudent(new Student(12, "Platte", "Noah", 4, "Programmieren", 15,1));
        DatabaseController.createStudent(new Student(13, "Hörcher", "Robert", 3, "Programmieren", 27,1));
        DatabaseController.createStudent(new Student(14, "Spahn", "Clara", 7, "Programmieren", 2,2));
        DatabaseController.createStudent(new Student(15, "Lerchenberger", "Sofia", 3, "Programmieren", 0,1));


    }


}
