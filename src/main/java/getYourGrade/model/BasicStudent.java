/** interface of a BasicStudent
 *
 * @author Marco Lorenz
 * @version 23.05.2021
 */

package getYourGrade.model;

public interface BasicStudent {

    /** returns the unique ID as type integer */
    public int getID();

    /** returns the last name as type String */
    public String getLASTNAME();

    /** returns the first name as type String */
    public String getFIRSTNAME();

    /** returns the course name as type String */
    public String getCourseName();

    /** returns the amount of missed days as type integer */
    public int getMissedDays();

    /** returns the grade as type int */
    public int getGrade();

    /** enables to set a new course name */
    public void setCourseName(String courseName);

    /** enables to change the missed days */
    public void setMissedDays(int missedDays);

    /** enables to change the grade */
    public void setGrade(int grade);

    /** resets missed days to zero */
    public void resetMissedDays();
}
