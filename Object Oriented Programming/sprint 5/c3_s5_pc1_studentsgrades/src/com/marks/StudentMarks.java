package com.marks;

public class StudentMarks {
    int math;
    int physics;
    int chemistry;
    int biology;
    int businessStudies;
    int finance;
    int accounting;
    int sum;

    public int calculateMarks(int math, int physics, int chemistry, int biology){
        sum= math+physics+chemistry+biology;
        return sum;
    }
    public int calculateMarks(int math, int physics, int chemistry){
        sum= math+physics+chemistry;
        return sum;
    }
    public int calculateMarks(double businessStudies, int finance, int accounting){
        sum = (int) (businessStudies+ finance + accounting);
        return sum;
    }



}
