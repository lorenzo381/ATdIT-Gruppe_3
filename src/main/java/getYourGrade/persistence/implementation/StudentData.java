/** The class StudentData represents the class Student in the database layer for abstraction reasons.
 * It contains mainly the same variables and methods.
 *
 * @author Marco Lorenz
 * @version 24.05.2021
 */

package getYourGrade.persistence.implementation;

public class StudentData {

    /** final instance variable for a unique number for each student */
    private int ID;

    /** final instance variable for the first name */
    private String FIRSTNAME;

    /** final instance variable for the last name */
    private String LASTNAME;

    /** instance variable for the name/subject of assigned course */
    private String courseName;

    /** instance variable for the amount of days/classes, a specific student has missed */
    private int missedDays;

    /** instance variable to store the grade of a specific student */
    private int grade;

    /** constructor to instantiate all variables of a StudentData instance
     *
     * @param ID
     * @param LASTNAME
     * @param FIRSTNAME
     * @param courseName
     * @param missedDays
     * @param grade
     */
    public StudentData(int ID, String LASTNAME, String FIRSTNAME, String courseName, int missedDays, int grade) {
        this.ID = ID;
        this.LASTNAME = LASTNAME;
        this.FIRSTNAME = FIRSTNAME;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    /** constructor without parameters */
    public StudentData() {

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
    public int getGrade() { return this.grade;};

    /** enables to change the value of the instance variable ID
     *
     * caution: only make use in urgent cases
     *
     * @param ID ID to be set
     */
    public void setId(int ID) {
        this.ID = ID;
    }

    /** enables to change the value of the instance variable LASTNAME
     *
     * caution: only make use in urgent cases
     *
     * @param LASTNAME last name to be set
     */
    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    /** enables to change the value of the instance variable FIRSTNAME
     *
     * caution: only make use in urgent cases
     *
     * @param FIRSTNAME first name to be set
     */
    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
    }

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
}
