package org.turntabl.io;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades,String name) {
        super(grades,name);
    }

    @Override
    public double getAverageGrade() {
        double naughtyAverage =super.getAverageGrade() * 1.1;
        System.out.println(naughtyAverage);
        return naughtyAverage;
    }


}
