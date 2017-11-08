package com.optaros.training;

/**
 * Created by loredana.crusoveanu on 11/8/2017.
 */
public class Student {
    private double grade;

    public Student(double grade) {
        this.grade = grade;
    }

    public Student() {}

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String isPassed(){
        if (grade >= 5){
            return "passed";
        }
        else {
            return "failed";
        }
    }
}
