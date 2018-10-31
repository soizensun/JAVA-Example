package jUnit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;


    // จะ init ต่า ก่อนจะทำทุกๆ @Test
    @BeforeEach
    void init(){
        student = new Student("kitpavin", "601040505922135465465798");
    }

    @Test
    void getName_ShouldReturnNameSuperClassPerson_WhenCall(){
        String actual = student.getName();
        assertEquals("kitpavin", actual);
    }

    @Test
    @DisplayName("เปลี่ยนชื่อได้ method setName()")
    void setName_ShouldChangeName_WhenReceiveNewName(){
        student.setName("B2");
        assertEquals("B2", student.getName());
    }

    @Test
    void addScore_ShouldIncreaseScore_WhenReceivePositiveNumber(){
        student.addScore(20);
        assertEquals(20.0, student.getScore());
        student.addScore(34.5);
        assertEquals(54.5, student.getScore());
    }

    @Test
    void addScore_ShouldThrowIlleGalArgumentException_WhenReceiveNegativeNumber(){
        assertThrows( IllegalArgumentException.class,
                () -> { student.addScore(-15.7); }
                );
    }

    @Test
    void addScore_ShouldNotIncreaseScore_WhenReceiveNegativeNumber(){
        Student student = new Student("Bew", "564165");
        try {
            student.addScore(-15.7);
        }catch (IllegalArgumentException ignored){}

        assertEquals(0.0, student.getScore());
    }
}