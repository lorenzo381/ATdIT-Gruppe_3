package library.model;

public interface BasicStudent {

    public void setId(int id);

    public void setLastName(String lastName);

    public void setFirstName(String firstName);

    public void setCourseName(String courseName);

    public void setMissedDays(int missedDays);

    public void setFrequency(int frequency);

    public void setGrade(int grade);

    public void addMissedDay();

    public void addFrequency();

    public int getId();

    public String getLastName();

    public String getFirstName();

    public String getCourseName();

    public int getMissedDays();

    public int getFrequency();

    public int getGrade();

    public void resetMissedDays();

    public void resetFrequency();
}
