package org.turntabl.io;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testGetAverageGrade() {
        Student student = new Student(List.of(5.0,5.0,5.0,5.0),"");
        double expectedAverage = (5.0+5.0+5.0+5.0) / 4;
        assertEquals(expectedAverage, student.getAverageGrade());
    }

}