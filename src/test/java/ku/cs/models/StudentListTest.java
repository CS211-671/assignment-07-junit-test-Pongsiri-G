package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList students;
    @BeforeEach
    void init() {
        students = new StudentList();
    }
    @Test
    void testAddNewStudent() {
        students.addNewStudent("Pongsiri","6610402167");
        assertNotNull(students);
    }

    @Test
    void findStudentById() {
        students.addNewStudent("Pongsiri","6610402167");
        students.addNewStudent("A","66xxxxxxx");
        Student student = students.findStudentById("66xxxxxxx");
        assertEquals("A", student.getName());

    }

    @Test
    void giveScoreToId() {
    }

    @Test
    void viewGradeOfId() {
    }

    @Test
    void getStudents() {
    }
}