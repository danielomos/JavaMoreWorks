package schoolManaementSystem;

import java.util.ArrayList;

public class Schools {
    private ArrayList<Courses> courseList ;
    private ArrayList<Students> studentList = new ArrayList<>();
    private String schoolName;
    private String schoolAddress;

    public Schools(String schoolName, String schoolAddress) {

        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    public ArrayList<Courses> getCourseList() {
        return courseList;
    }

    public void CreateCourse(Courses newCourse) {

        courseList.add(newCourse);
    }

    public ArrayList<Students> getAllStudent() {
        return studentList;
    }

    public void setStudentList(ArrayList<Students> studentList)
    {

        this.studentList = studentList;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public void admitStudent(String firstName,String lastName,Gender gender,int age) {
       Students newStudent = new Students(firstName,lastName,gender,age);

        studentList.add(newStudent);    }

    public Students findStudent(int id) {
        int studentIndexToFind = -1;
        for(int i=0;i<studentList.size();i++){
            if (studentList.get(i).getStudentId() == id){
                studentIndexToFind = i;
                break;

            }

        }
        if(studentIndexToFind == -1){
            throw new IllegalArgumentException("Student Id " +id + " not found");
        }
        return studentList.get(studentIndexToFind);

    }
    public void expelStudent(int id){
        Students studentToExpel = findStudent(id);
        studentList.remove(studentToExpel);
    }
}
