package getYourGrade;

import getYourGrade.model.implementation.MockData;
import getYourGrade.model.implementation.Student;
import getYourGrade.persistence.implementation.DatabaseController;
import getYourGrade.persistence.implementation.StudentData;
import getYourGrade.presentation.LogInScreen;

import java.util.ResourceBundle;


public class main {


    public static void main(String[] args) {


        DatabaseController.clearTable();
        DatabaseController.createTable();

        Student[] students = new Student[15];
        StudentData[] studentData = new StudentData[15];
        ResourceBundle resourcebundle = ResourceBundle.getBundle("i18n/presentation");

        for(int i=0; i<15; i++) {
            students[i] = MockData.getMockStudent(resourcebundle.getString("Mathematik"));
            studentData[i] = new StudentData(students[i].getID(), students[i].getLASTNAME(), students[i].getFIRSTNAME(), students[i].getCourseName(), students[i].getMissedDays(), students[i].getGrade());
            DatabaseController.createStudent(studentData[i]);
        }

        LogInScreen ls = new LogInScreen();
    }
}
