package org.turntabl.io;

import java.util.List;

public class Student implements Nameable, HasLevel {
    private List<Double> grades;
    private String name;
    private Level level;

    public Student(List<Double> grades ,String name,Level level) {
        this.grades = grades;
        this.name=name;
        this.level=level;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;

        }
        return sum / grades.size();
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public Level getLevel() {
        return level;
    }
}
