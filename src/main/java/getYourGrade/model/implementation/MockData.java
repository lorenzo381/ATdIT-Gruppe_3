/** The class MockDate provides consistent mock data e. g. for a showcase.
 *
 * @author Marco Lorenz
 * @version 24.05.2021
 */

package getYourGrade.model.implementation;

public class MockData {

    /** provides a series of different integers starting with zero incrementing by 1 */
    private static int nextID;

    /** array with 15 last names */
    private static final String[] LASTNAMES = {"Pfeifer", "Höler", "Joas", "Langer", "Gröbel", "Meier", "Plattner", "Podolski", "Schreiber", "Amberger", "Höfer", "Rehm", "Wagner", "Beck", "Grande"};

    /** array with 15 first names */
    private static final String[] FIRSTNAMES = {"Lea", "Dario", "Kevin", "Leonard", "Laura", "Marie", "Stefan", "Robert", "Mona", "Alea", "Konstantin", "Tim", "Lukas", "Matthias", "Robert"};

    /** array with 15 amounts of missed days */
    private static final int[] missedDays = {1, 2, 0, 4, 2, 3, 0, 0, 1, 2, 1, 0, 3, 4, 0};

    /** array with 15 possible grades */
    private static final int[] grades = {0, 4, 2, 3, 0, 0, 1, 2, 1, 0, 3, 4, 0, 5, 5};

    /** returns an already instantiated Student with mock data and an assigned <code> courseName </code>
     *
     * @param courseName  name of the course, the new Student shall be assigned to
     */
    public static Student getMockStudent(String courseName) {
        int currentID = nextID;
        nextID++;
        Student returnStudent = new Student(currentID, LASTNAMES[currentID], FIRSTNAMES[currentID], courseName, missedDays[currentID], grades[currentID]);
        if (nextID == 15)
            nextID = 0;
        return returnStudent;
    }
}
