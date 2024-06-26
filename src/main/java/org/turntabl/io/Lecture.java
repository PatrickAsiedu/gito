package org.turntabl.io;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();



    public void enter(Student student) {
        students.add(student);
    }


    public double getHighestAverage (){

        double highestAverage =0.0 ;
        for (Student student : students){
            if(student.getAverageGrade() > highestAverage ){
                highestAverage=student.getAverageGrade();
            }


        }
//        System.out.println(highestAverage);
        return highestAverage;


    }

    public List<Student> getStudents() {
        return students;
    }
}
