package org.turntabl.io;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {
    @Test
    public void testRegister(){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"Patrick");
        Student student2 = new Student(List.of(5.0,5.0,5.0,5.0),"Kennedy");
//        System.out.println(student1.getName());
        Register myreg = new Register(List.of(student1,student2));
        List<String> expected = List.of("Patrick","Kennedy");
        assertEquals(expected,myreg.getRegister());

    }

}