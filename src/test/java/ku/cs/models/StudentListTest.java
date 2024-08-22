package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    Student student;
    StudentList students;
    @BeforeEach
    void init() {
        students = new StudentList();
        student = null;
    }
    @Test
    void testAddNewStudent() {
        students.addNewStudent("Pongsiri","6610402167");
        assertNotNull(students);
    }

    @Test
    void findStudentById() {
        students.addNewStudent("66xxxxxxxx","A");
        student = students.findStudentById("66xxxxxxxx");
        assertEquals("A", student.getName());
    }

    @Test
    void giveScoreToId() {
        students.addNewStudent("66xxxxxxxx","A");
        students.giveScoreToId("66xxxxxxxx", 50);
        assertEquals(50, students.findStudentById("66xxxxxxxx").getScore());
    }

    @Test
    void viewGradeOfId() {
        students.addNewStudent("66xxxxxxxx","A");
        students.giveScoreToId("66xxxxxxxx", 50);
        assertEquals("D", students.viewGradeOfId("66xxxxxxxx"));
    }

}