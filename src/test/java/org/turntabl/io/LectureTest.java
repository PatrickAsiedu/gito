package org.turntabl.io;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class LectureTest {
    @Test
    public void testGetHighestAverage (){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"");
        Student student2 = new Student(List.of(10.0,5.0,5.0,5.0),"");
        NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"");
        Lecture mylec = new Lecture();
        mylec.enter(student1);
        mylec.enter(student2);
        mylec.enter(naughtyStudent);
        System.out.println(mylec.getHighestAverage());
        assertEquals(6.25,mylec.getHighestAverage());


    }

    @Test
    public void testNaughtyStudentAverageIncrease(){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"");
        Student student2 = new Student(List.of(10.0,5.0,5.0,5.0),"");
        NaughtyStudent naughtyStudent1 = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"");
        NaughtyStudent naughtyStudent2 = new NaughtyStudent(List.of(10.0,5.0,5.0,5.0),"");
        Lecture mylec = new Lecture();
        mylec.enter(student1);
        mylec.enter(student2);
        mylec.enter(naughtyStudent1);
        mylec.enter(naughtyStudent2);
        assertEquals(6.25*1.1,mylec.getHighestAverage());

    }

}