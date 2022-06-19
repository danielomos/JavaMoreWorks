package schoolManaementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static schoolManaementSystem.Gender.Female;
import static schoolManaementSystem.Gender.Male;

class StudentsTest {
    Courses newCourse;
    Students newStudent;

    @BeforeEach
    void setUp() {
        newCourse = new Courses("kotlin");
        newStudent = new Students("daniel","omosele",Male,20);
       // newStudent.selectCourse(newCourse);

    }
    @Test
    void getCourseTest(){
        newStudent.selectCourse(newCourse);
        Courses course1= new Courses("biology");
        newStudent.selectCourse(course1);
        assertEquals("biology",newStudent.getIndividualCourse("biology"));
    }

    @Test
    void GetStudentFirstNameTest(){

        assertEquals("daniel",newStudent.getStudentFirstName());
    }
    @Test
    void getCourseNameTest(){
        assertEquals("kotlin",newCourse.getCourseName());
    }
    @Test
    void getStudentLastNameTest(){
        assertEquals("omosele",newStudent.getStudentLastName());
    }
    @Test
    void getStudentIdTest(){
       Students newStudent1 =new Students("grace","ofGod",Female,30);

        assertEquals(1,newStudent.getStudentId());
        assertEquals(2,newStudent1.getStudentId());
    }
    void getStudentGenderTest(){
        assertEquals(Male,  newStudent.getYourgender());
    }
    @Test
    void getStudentAgeTest(){
        assertEquals(20,newStudent.getStudentAge());
    }
    @Test
    void getCourseStatus(){
        assertFalse(newCourse.isStatus());
    }
    @Test
    void studentCanAddCourseTest(){

        newStudent.selectCourse(newCourse);
        Courses course1= new Courses("biology");
        newStudent.selectCourse(course1);
        course1.isStatus();
        //this below will return an object type course
        assertEquals("biology", newStudent.getAllCourse().get(1).getCourseName());

    }
    @Test
    void getAllStudentCourse(){
        Courses courses1 = new Courses("english");
        newStudent.selectCourse(newCourse);
        Courses course1= new Courses("biology");
        newStudent.selectCourse(course1);
        //this below will return arrayList in the method
        assertEquals(2,newStudent.getAllCourse().size());
    }
    @Test
    void dropCourseOfferedTest(){
        Courses courses1 = new Courses("english");
        newStudent.selectCourse(newCourse);
        Courses course1= new Courses("biology");
        newStudent.selectCourse(course1);
        assertEquals(2,newStudent.getAllCourse().size());
        newStudent.dropCourse("biology");

        assertEquals(1,newStudent.getAllCourse().size());

    }

}