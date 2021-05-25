/** main class that contains the main method
 *
 * @author Marco Lorenz
 * @version 24.05.2021
 */

package getYourGrade;

import getYourGrade.model.implementation.MockData;
import getYourGrade.model.implementation.Student;
import getYourGrade.persistence.implementation.DatabaseController;
import getYourGrade.persistence.implementation.StudentData;
import getYourGrade.presentation.LogInScreen;

import java.util.Locale;
import java.util.ResourceBundle;


public class main {


    /** The main method first clears potentially deprecated data in the database and refills it with consistent mock data.
     *  After that it will call the first presentation screen.
     *
     * @param args (default parameter of main method in JAVA)
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMAN);


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
