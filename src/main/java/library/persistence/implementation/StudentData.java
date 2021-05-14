package library.persistence.implementation;

public class StudentData {

    private /*final*/ int id;
    private /*final*/ String password;
    private /*final*/ String firstName;
    private /*final*/ String lastName;
    private String courseName;
    private int missedDays;
    private double averageGrade;
    private int frequency;
    private int grade;

    //students' id space
    public static int nextId = 0;

    public StudentData(String password, String lastName, String firstName) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.frequency = 0;
    }

    public StudentData(String password, String lastName, String firstName, String courseName) {
        this.id = nextId++;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = 0;
        this.frequency = 0;
    }

    public StudentData(int id, String lastName, String firstName, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.frequency = 0;
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

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addMissedDay() {
        this.missedDays++;
    }

    public void addFrequency() {
        this.frequency++;
    }

    public int getId() {
        return this.id;
    }

    public String getPassword() {
        return this.password;
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

    public int getFrequency() {
        return this.frequency;
    }

    public int getGrade() { return this.grade;};

    public void resetMissedDays() {
        this.missedDays = 0;
    }

    public void resetFrequency() {
        this.frequency = 0;
    }
}
