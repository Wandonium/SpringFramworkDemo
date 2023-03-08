package AnnotationsBased;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */

@Component
public class Student implements School {
    public void learn() {
        System.out.println("Student is learning...");
    }

    @Override
    public void inSchool() {
        learn();
    }
}
