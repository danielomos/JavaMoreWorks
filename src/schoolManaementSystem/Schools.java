package schoolManaementSystem;

import java.util.ArrayList;

public class Schools {
    private ArrayList<Courses> courseList  = new ArrayList<>();
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

    public void CreateCourse(String coursename) {
        Courses newCourse = new Courses(coursename);
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

    public void admitStudent(Students student) {
       //Students newStudent = new Students(firstName,lastName,gender,age);

        studentList.add(student);    }

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
    public Students findStuden(int id) {
        int idd = id-1;
        return  studentList.get(idd);
//        Students foundstudent;
//        for(Students var : studentList){
//            if (var.getStudentId() == id){
//               foundstudent = var;
//                break;
//            }
//
//        }
//        if(foundstudent){
//            throw new IllegalArgumentException("Student Id " +id + " not found");
//        }
//        return foundstudent;

    }
    public void expelStudent(int id){
        Students tofind= findStuden(id);

        studentList.remove(tofind);
    }
}
