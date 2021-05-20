package getYourGrade.model;

public interface BasicStudent {

    public int getID();

    public String getLASTNAME();

    public String getFIRSTNAME();

    public String getCourseName();

    public int getMissedDays();

    public int getGrade();

    public void setCourseName(String courseName);

    public void setMissedDays(int missedDays);

    public void setGrade(int grade);

    public void resetMissedDays();
}
