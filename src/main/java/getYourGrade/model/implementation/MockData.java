package getYourGrade.model.implementation;

public class MockData {

    private static int nextID;
    private static final String[] lastNames = {"Pfeifer", "Höler", "Joas", "Langer", "Gröbel", "Meier", "Plattner", "Podolski", "Schreiber", "Amberger", "Höfer", "Rehm", "Wagner", "Beck", "Grande"};
    private static final String[] firstNames = {"Lea", "Dario", "Kevin", "Leonard", "Laura", "Marie", "Stefan", "Robert", "Mona", "Alea", "Konstantin", "Tim", "Lukas", "Matthias", "Robert"};
    private static final int[] missedDays = {1, 2, 0, 4, 2, 3, 0, 0, 1, 2, 1, 0, 3, 4, 0};
    private static final int[] grades = {0, 4, 2, 3, 0, 0, 1, 2, 1, 0, 3, 4, 0, 5, 5};

    public static Student getMockStudent(String courseName) {
        nextID++;
        Student returnStudent = new Student(nextID, lastNames[nextID], firstNames[nextID], courseName, missedDays[nextID], grades[nextID]);
        if (nextID == 15)
            nextID = 0;
        return returnStudent;
    }
}
