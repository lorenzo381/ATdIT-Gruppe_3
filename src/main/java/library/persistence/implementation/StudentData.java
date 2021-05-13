package library.persistence.implementation;

public class StudentData {

    private /*final*/ int id;
    private /*final*/ String password;
    private /*final*/ String name;
    private String courseName;
    private int missedDays;
    private double averageGrade;
    private int frequency;

    //students' id space
    public static int nextId = 0;

    public StudentData(String password, String name) {
        this.id = nextId++;
        this.password = password;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = 0;
        this.frequency = 0;
    }

    public StudentData(String password, String name, String courseName) {
            this.id = nextId++;
            this.password = password;
            this.name = name;
            this.courseName = courseName;
            this.missedDays = 0;
            this.frequency = 0;
    }

    public StudentData(int id, String name, String courseName, int missedDays) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.courseName = courseName;
        this.missedDays = missedDays;
        this.frequency = 0;
    }

    public StudentData() {

    }

    public void setId(int id) {
        this.id = id;

    }
    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return this.name;
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
