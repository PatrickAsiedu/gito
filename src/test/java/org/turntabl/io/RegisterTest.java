package org.turntabl.io;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {
    @Test
    public void testRegister(){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"Patrick" ,Level.JUNIOR);
        Student student2 = new Student(List.of(5.0,5.0,5.0,5.0),"Kennedy",Level.JUNIOR);
//        System.out.println(student1.getName());
        Register myreg = new Register(List.of(student1,student2));
        List<String> expected = List.of("Patrick","Kennedy");
        assertEquals(expected,myreg.getRegister());

    }

    @Test
    public void testGetRegisterByLevelMap(){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"Patrick" ,Level.JUNIOR);
        Student student2 = new Student(List.of(5.0,5.0,5.0,5.0),"Kennedy",Level.JUNIOR);
        Student student3 = new Student(List.of(5.0,5.0,5.0,5.0),"Fred",Level.MID);
        Student student4 = new Student(List.of(5.0,5.0,5.0,5.0),"Ben",Level.MID);
//        System.out.println(student1.getName());
        Register myreg = new Register(List.of(student1,student2,student3,student4));

        Map<Level,List<Student>> getLevel = myreg.getRegisterByLevel();
        assertEquals(List.of(student1,student2),getLevel.get(Level.JUNIOR));
        assertEquals(List.of(student3,student4),getLevel.get(Level.MID));


    }

    @Test
    public void testSortByNameStudent(){
        Student student1 = new Student(List.of(5.0,5.0,5.0,5.0),"Patrick" ,Level.JUNIOR);
        Student student2 = new Student(List.of(5.0,5.0,5.0,5.0),"Kennedy",Level.JUNIOR);
        Student student3 = new Student(List.of(5.0,5.0,5.0,5.0),"Fred",Level.MID);
        Student student4 = new Student(List.of(5.0,5.0,5.0,5.0),"Ben",Level.MID);

        Register myreg = new Register(List.of(student1,student2,student3,student4));
        List<Student> sortedStudents = myreg.sort((sone,stwo)-> sone.getName().compareTo(stwo.getName()));
        assertEquals(List.of(student4,student3,student2,student1),sortedStudents);



    }
    @Test
    public void testSortByNameNaughtyStudent(){
        NaughtyStudent student2 = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"Kennedy",Level.JUNIOR);
        NaughtyStudent student1 = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"Patrick" ,Level.JUNIOR);
        Student student3 = new Student(List.of(5.0,5.0,5.0,5.0),"Fred",Level.MID);
        NaughtyStudent student4 = new NaughtyStudent(List.of(5.0,5.0,5.0,5.0),"Ben",Level.MID);

        Register myreg = new Register(List.of(student1,student2,student3,student4));
        List<Student> sortedStudents = myreg.sort((sone,stwo)-> sone.getName().compareTo(stwo.getName()));
        assertEquals(List.of(student4,student3,student2,student1),sortedStudents);



    }

}