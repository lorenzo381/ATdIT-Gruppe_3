package library.persistence.implementation;

public class StudentData {

    private /*final*/ int id;
    private /*final*/ String password;
    private /*final*/ String firstname;
    private /*final*/ String lastname;
    private String courseName;
    private int missedDays;
    private double averageGrade;
    private int frequency;

    //students' id space
    public static int nextId = 0;

    public StudentData(String password, String lastname, String firstname) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = 0;
        this.frequency = 0;
    }

    public StudentData(String password, String lastname, String firstname, String courseName) {
        this.id = nextId++;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = 0;
        this.frequency = 0;
    }

    public StudentData(int id, String lastname, String firstname, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.frequency = 0;
    }

    public StudentData() {

    }

    public void setId(int id) {
        this.id = id;

    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String getLastname() {
        return this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
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

    public void resetMissedDays() {
        this.missedDays = 0;
    }

    public void resetFrequency() {
        this.frequency = 0;
    }
}
