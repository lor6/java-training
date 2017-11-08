package com.optaros.training;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by loredana.crusoveanu on 11/8/2017.
 */
public class StudentTest {

    @Test
    public void givenStudent_whenGradeGreaterThan5_thenPassed(){
        Student student = new Student();
       student.setGrade(6);
        assertEquals("Result is incorrect","passed", student.isPassed());

    }

    @Test
    public void givenStudent_whenGradeLessThan5_thenFailed(){
        Student student = new Student();
        student.setGrade(4);
        assertEquals("Result is incorrect","failed", student.isPassed());

    }
}
