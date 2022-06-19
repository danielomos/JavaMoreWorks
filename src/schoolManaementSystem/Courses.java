package schoolManaementSystem;

public class Courses {
    private String courseName;
    private final int courseId;
    private static int idIncrement = 1;
    private boolean status;

    public Courses(String name){
        this.courseName  = name;
        this.courseId = idIncrement++;

    }

    public String getCourseName() {
        return courseName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseName(String course) {
        this.courseName=course;

    }
}
