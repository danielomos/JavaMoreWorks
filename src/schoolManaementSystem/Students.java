package schoolManaementSystem;

import java.util.ArrayList;

public class Students {
    private String firstName;
    private String lastName;
    private Gender yourgender;
    private int age;
    private int studentId;
    private static int idIncrement = 1;
    private ArrayList<Courses> courseList = new ArrayList<>();

    public Students(String firstName, String lastName, Gender yourGender, int age){

         this.firstName = firstName;

         this.lastName = lastName;

        this.yourgender = yourGender;
        this.age= age;
        this.studentId = idIncrement++;

    }

    public void selectCourse(Courses newCourse) {
        if(newCourse.isStatus()){
            courseList.add(newCourse);
        }
       else {
            throw new IllegalArgumentException("this Course is not activated");

        }

    }

    public Gender getYourgender() {
        return yourgender;
    }

    public String getStudentFirstName() {
        return firstName;
    }

    public String getStudentLastName() {
        return lastName;
    }

    public Gender getStudentGender() {
        return yourgender;
    }

    public int getStudentAge() {
        return  age;
    }

    public Courses getIndividualCourse(String name) {
       int courseIndexToFind = -1;
       for(int i=0;i<courseList.size();i++){
            if (courseList.get(i).getCourseName().equalsIgnoreCase(name)){
                courseIndexToFind =i;
                break;
            }

        }
        if(courseIndexToFind == -1){
            throw new IllegalArgumentException("course " +name+"not found");
        }
            return courseList.get(courseIndexToFind);
    }

    public ArrayList<Courses> getAllCourse() {
        return courseList;
    }


    public void dropCourse(String courseName) {

        ;
        courseList.remove(getIndividualCourse(courseName));
    }

    public int getStudentId() {
        return studentId;
    }
}
