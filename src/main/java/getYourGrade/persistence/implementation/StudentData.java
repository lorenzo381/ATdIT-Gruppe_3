package getYourGrade.persistence.implementation;

public class StudentData {

    private int id;
    private String firstName;
    private String lastName;
    private String courseName;
    private int missedDays;
    private int grade;

    public StudentData(int id, String lastName, String firstName, String courseName, int missedDays, int frequency, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = missedDays;
    }

    public StudentData() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getMissedDays() {
        return this.missedDays;
    }

    public int getGrade() { return this.grade;};

    public void resetMissedDays() {
        this.missedDays = 0;
    }
}
