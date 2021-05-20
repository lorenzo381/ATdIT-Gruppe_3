package getYourGrade.persistence.implementation;

public class StudentData {

    private int ID;
    private String FIRSTNAME;
    private String LASTNAME;
    private String courseName;
    private int missedDays;
    private int grade;

    public StudentData(int ID, String LASTNAME, String FIRSTNAME, String courseName, int missedDays, int grade) {
        this.ID = ID;
        this.LASTNAME = LASTNAME;
        this.FIRSTNAME = FIRSTNAME;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.grade = grade;
    }

    public StudentData() {

    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setLASTNAME(String LASTNAME) {
        this.LASTNAME = LASTNAME;
    }

    public void setFIRSTNAME(String FIRSTNAME) {
        this.FIRSTNAME = FIRSTNAME;
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

    public int getID() {
        return this.ID;
    }

    public String getLASTNAME() {
        return this.LASTNAME;
    }

    public String getFIRSTNAME() {
        return this.FIRSTNAME;
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
