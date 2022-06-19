package schoolManaementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolsTest {
    Schools newSchool;
    Courses course;
    Students student;

    @BeforeEach
    void setup() {
        newSchool = new Schools("Semicolon School", "yaba");

    }

    @Test
    void weCanCreateSchool() {
        assertNotNull(newSchool);
    }

    @Test
    void courseWasSetup() {
        assertNotNull(course);

    }


    @Test
    void studentWasSetup() {
        assertNotNull(student);
    }

    @Test
    void getCourseName() {
        assertEquals("biology", course.getCourseName());
    }

    @Test
    void weCanAdmitStudentTest() {


        newSchool.admitStudent("great", "more", Gender.Female, 20);
        newSchool.admitStudent("daniel", "omosele", Gender.Male, 30);


        assertEquals(2, newSchool.getAllStudent().size());


    }

    @Test
    void weCanFindAStundentWithStudentIdTest() {
        newSchool.admitStudent("great", "more", Gender.Female, 20);
        student = newSchool.findStudent(1);
        assertEquals(1, student.getStudentId());
    }

    @Test
    void weCanExpellAStudent() {
        newSchool.admitStudent("great", "more", Gender.Female, 20);
        newSchool.expelStudent(1);
        assertEquals(0, newSchool.getAllStudent().size());
    }

    @Test
    void weCanCreateCourseToResiter() {
        Courses courses1 = new Courses("math");
        newSchool.CreateCourse(course);
        newSchool.CreateCourse(courses1);

        assertEquals(2, newSchool.getCourseList().size());

//    }
//    @Test
//    void weCan
    }
}