package org.turntabl.io;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NaughtyStudentTest {

    @Test
    public void testInstanceofStudent(){
        NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"",Level.JUNIOR);
        assertInstanceOf(Student.class, naughtyStudent);

    }
    @Test
    public void cheatedAverageoften(){
        NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"",Level.JUNIOR);
//        double expected = naughtyStudent.getAverageGrade() / 1.1;
        assertEquals(5.5, naughtyStudent.getAverageGrade());

    }

}