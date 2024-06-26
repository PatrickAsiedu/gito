package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {

    private List<Student> Lectures;

    public BagOfLectures() {
        this.Lectures = new ArrayList<>();
    }


    public void add(Student student) {
        Lectures.add(student);
    }


    public void remove(Student student) {
        Lectures.remove(student);
    }


    public void clear() {
        Lectures.clear();
    }

    public List<Student> getLectures() {
        return Lectures;
    }
}
