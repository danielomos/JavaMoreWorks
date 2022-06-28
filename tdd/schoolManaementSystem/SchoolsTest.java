package schoolManaementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolsTest {
    Schools newSchool;
    Courses course;
    Students student;
    Students studen1;

    @BeforeEach
    void setup() {
        newSchool = new Schools("Semicolon School", "yaba");
        course = new Courses("math");
        student = new Students("grea", "more", Gender.Female, 20);
        studen1 = new Students("daniel", "omosele", Gender.Male, 30);

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
        newSchool.admitStudent(student);

        assertEquals(1,newSchool.getAllStudent().size());
    }

    @Test
    void getCourseName() {
        assertEquals("math", course.getCourseName());
    }

    @Test
    void weCanAdmitStudentTest() {


        newSchool.admitStudent(student);
        newSchool.admitStudent(studen1);

        assertEquals(2, newSchool.getAllStudent().size());


    }

    @Test
    void weCanFindAStundentWithStudentIdTest() {
        newSchool.admitStudent(student);
        newSchool.admitStudent(studen1);

        Students in = newSchool.findStuden(2);
        assertEquals(1,in.getStudentId());
    }

    @Test
    void weCanExpellAStudent() {
        newSchool.admitStudent(student);
        newSchool.admitStudent(studen1);
        assertEquals(2,newSchool.getAllStudent().size());


        newSchool.expelStudent(1);
      //  assertEquals(1, newSchool.getAllStudent().size());
    }

//    @Test
//    void weCanCreateCourseToResiter() {
//        Courses courses1 = new Courses("math");
////        newSchool.CreateCourse(course);
////        newSchool.CreateCourse(courses1);
//
//        assertEquals(2, newSchool.getCourseList().size());

//    }
//    @Test
//    void weCan
//    }
}