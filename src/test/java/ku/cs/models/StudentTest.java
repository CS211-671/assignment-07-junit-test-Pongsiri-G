package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void init() {
        s1 = new Student("6xxxxxxxxx", "Pongsiri");
    }

    @Test
    void testAddScore(){
        // Student s1 = new Student("6xxxxxxxxx", "Pongsiri");
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        // Student s1 = new Student("6xxxxxxxxx", "Pongsiri", 50);
        s1.addScore(60);
        assertEquals("C", s1.grade());
    }

    @Test
    void testChangeName(){
        s1.changeName("Put");
        assertEquals("Put", s1.getName());
    }

    @Test
    void testIsID(){
        assertTrue(s1.isId("6xxxxxxxxx"));
    }

}