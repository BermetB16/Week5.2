package constructor;

public class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
        printClassroomDetails();
    }

    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }
    public void printClassroomDetails() {
        System.out.println("Classroom Details:");
        System.out.println("Class Name: " + className);
        System.out.println("Students:");

        if (students != null && students.length > 0) {
            for (int i = 0; i < students.length; i++) {
                System.out.println("  " + (i + 1) + ". " + students[i]);
            }
        } else {
            System.out.println("  No students enrolled");
        }
        System.out.println("--------------------");
    }
}
