package unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    private Student student;
    private Student student1;
    private Student student2;
    private Classroom classroom;
    private Classroom classroom1;

    @BeforeEach
    void init(){
        student = new Student("kitpavin","6010405092");
        student1 = new Student("Kanoon", "1011545164");
        student2 = new Student("Sirikan", "14555772");
        classroom = new Classroom();
        classroom1 = new Classroom();
    }


    @Test
    void addStudent_addStudentInToCollection_WhenReceiveNewStudent(){
        classroom.addStudent(student);
        classroom.addStudent(student1);
        assertEquals(2, classroom.size());
    }

    @Test
    void addScoreById_addScoreFromCollection_WhenReceiveIdAndScore(){
        classroom.addStudent(student);
        classroom.addScoreById("6010405092", 77);
        assertEquals(77, student.getScore());
        assertThrows( NoSuchElementException.class,
                ()->{ classroom.addScoreById("55", 45); }
                );
    }

    @Test
    void getScoreById_getScoreFromCollection__WhenReceiveId(){
        classroom.addStudent(student);
        classroom.addScoreById("6010405092", 77);
        double a = classroom.getScoreById("6010405092");
        assertEquals(a, student.getScore());
        assertThrows( NoSuchElementException.class,
                ()->{ classroom.getScoreById("5558745"); }
                );
    }


    @Test
    void averageScore_getAverageScoreFormCollection_WhenCall(){
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        classroom.addScoreById("6010405092",40);
        classroom.addScoreById("1011545164",30);
        classroom.addScoreById("14555772",20);

        double a = classroom.averageScore();
        double b = classroom1.averageScore();

        assertEquals(a, (40 + 30 + 20)/3);
        assertEquals(b, 0);
    }

    @Test
    void totalScore_getTotalScore_WhenCall(){
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        classroom.addScoreById("6010405092",40);
        classroom.addScoreById("1011545164",30);
        classroom.addScoreById("14555772",20);

        double a = classroom.totalScore();

        assertEquals(a,40+30+20);
    }

    @Test
    void size_getSizeOfCollection_WhenCall(){
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);

        int a = classroom.size();

        assertEquals(a, 3);
    }

}