/** The class Student implements the interface BasicStudent and represents a student with basic functionality.
 *
 * @author Marco Lorenz
 * @version 24.05.2021
 */

package getYourGrade.model.implementation;

import getYourGrade.model.BasicStudent;
import getYourGrade.persistence.implementation.StudentData;

public class Student implements BasicStudent {
    /** final instance variable for a unique number for each student */
    private final int ID;

    /** final instance variable for the first name */
    private final String FIRSTNAME;

    /** final instance variable for the last name */
    private final String LASTNAME;

    /** instance variable for the name/subject of assigned course */
    private String courseName;

    /** instance variable for the amount of days/classes, a specific student has missed */
    private int missedDays;

    /** instance variable to store the grade of a specific student */
    private int grade;

    public Student(StudentData studentData) {
        this.ID = studentData.getID();
        this.LASTNAME = studentData.getLASTNAME();
        this.FIRSTNAME = studentData.getFIRSTNAME();
        this.courseName = studentData.getCourseName();
        this.missedDays = studentData.getMissedDays();
        this.grade = studentData.getGrade();
    }

    public Student(int ID, String LASTNAME, String FIRSTNAME, String courseName, int missedDays, int grade) {
        this.ID = ID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    /** returns the unique ID as type integer */
    public int getID() {
        return this.ID;
    }

    /** returns the last name as type String */
    public String getLASTNAME() {
        return this.LASTNAME;
    }

    /** returns the first name as type String */
    public String getFIRSTNAME() {
        return this.FIRSTNAME;
    }

    /** returns the course name as type String */
    public String getCourseName() {
        return this.courseName;
    }

    /** returns the amount of missed days as type integer */
    public int getMissedDays() {
        return this.missedDays;
    }

    /** returns the grade as type int */
    public int getGrade() { return this.grade;}

    /** enables to set a new course name */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /** enables to change the missed days */
    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    /** enables to change the grade */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /** resets missed days to zero */
    public void resetMissedDays() {
        this.missedDays = 0;
    }
}
