package uz.pdp.online.model;

public class Student {

    private final String id;
    private String name;
    private String courseName;
    private int totalExamScores;
    private int totalAssScores;
    private int finalGrade;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalExamScores() {
        return totalExamScores;
    }

    public void setTotalExamScores(int totalExamScores) {
        this.totalExamScores = totalExamScores;
    }

    public int getTotalAssScores() {
        return totalAssScores;
    }

    public void setTotalAssScores(int totalAssScores) {
        this.totalAssScores = totalAssScores;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Student(String id, String name, String courseName, int totalExamScores, int totalAssScores, int finalGrade) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.totalExamScores = totalExamScores;
        this.totalAssScores = totalAssScores;
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "Student ID: "+ id + '\n' +
                "Student name=" + name + '\n' +
                "Course Name=" + courseName + '\n' +
                "Total Exam Scores=" + totalExamScores+ "\n"+
                "Total Assignment Scores=" + totalAssScores +"\n"+
                "Final Grade=" + finalGrade;
    }
}
