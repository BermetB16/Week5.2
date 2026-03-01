package constructor;

public class Student {
    private String studentName;
    private int studentID;
    private double grade;

    public Student(){
        this.studentName = "Unknown";
        this.studentID = 0;
        this.grade = 0.00;
    }
     public Student(String studentName,int studentID, double grade){
        this.studentName = studentName;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGrade() {
        return grade;
    }

    public int getStudentID() {
        return studentID;
    }
}
