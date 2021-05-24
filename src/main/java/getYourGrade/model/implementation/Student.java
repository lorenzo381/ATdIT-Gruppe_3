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

    /** constructor to instantiate a student out of a given StudentData instance
     *
     * @param studentData instance to create a student of
     */
    public Student(StudentData studentData) {
        this.ID = studentData.getID();
        this.LASTNAME = studentData.getLASTNAME();
        this.FIRSTNAME = studentData.getFIRSTNAME();
        this.courseName = studentData.getCourseName();
        this.missedDays = studentData.getMissedDays();
        this.grade = studentData.getGrade();
    }

    /** constructor to instantiate all variables of a Student instance
     *
     * @param ID
     * @param LASTNAME
     * @param FIRSTNAME
     * @param courseName
     * @param missedDays
     * @param grade
     */
    public Student(int ID, String LASTNAME, String FIRSTNAME, String courseName, int missedDays, int grade) {
        this.ID = ID;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    /***
     *
     * @return ID of referring StudentData instance as type integer
     */
    public int getID() {
        return this.ID;
    }

    /** returns last name
     *
     * @return last name of referring StudentData instance as type String
     */
    public String getLASTNAME() {
        return this.LASTNAME;
    }

    /** returns first name
     *
     * @return first name of referring StudentData instance as type String
     */
    public String getFIRSTNAME() {
        return this.FIRSTNAME;
    }

    /** returns course name
     *
     * @return course name of referring StudentData instance as type String
     */
    public String getCourseName() {
        return this.courseName;
    }

    /** returns amount of missed days
     *
     * @return amount of missed days of referring StudentData instance as type integer
     */
    public int getMissedDays() {
        return this.missedDays;
    }

    /** returns grade
     *
     * @return grade of referring StudentData instance as type integer
     */
    public int getGrade() { return this.grade;}

    /** enables to change the value of the instance variable courseName
     *
     * @param courseName course name to be set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /** enables to change the value of the instance variable MissedDays
     *
     * @param missedDays missed days to be set
     */
    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    /** enables to change the value of the instance variable grade
     *
     * @param grade grade to be set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /** resets missed days to zero */
    public void resetMissedDays() {
        this.missedDays = 0;
    }
}
