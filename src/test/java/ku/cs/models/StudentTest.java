package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อเป็น StudentTest2")
    void testChangeName(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.changeName("StudentTest2");
        assertEquals("StudentTest2", s.getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเทียบ ID")
    void testisId(){
        Student s = new Student("6712345678", "StudentTest");
        s.isId("6712345678");
        assertEquals("StudentTest", s.getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }



}