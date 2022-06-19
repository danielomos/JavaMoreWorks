package schoolManaementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoursesTest {
    Courses course;
    @BeforeEach
    void setup(){
       course = new Courses("java");

    }
    @Test
    void getCourseNameTest(){
        assertEquals("java",course.getCourseName());
    }

    @Test
    void getCourseIdTest(){
        Courses newCourse2 = new Courses("Python");
        assertEquals(1,course.getCourseId());
        assertEquals(2, newCourse2.getCourseId());
    }
    @Test
    void setCourseNameTest(){
        course.setCourseName("javaScript");
        assertEquals("javaScript",course.getCourseName());

    }
    

}