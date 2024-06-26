package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    private List<Student> students;

    public BagOfStudents() {
        this.students = new ArrayList<>();
    }


    public void add(Student student) {
        students.add(student);
    }


    public void remove(Student student) {
        students.remove(student);
    }


    public void clear() {
        students.clear();
    }

    public List<Student> getStudents() {
        return students;
    }
}