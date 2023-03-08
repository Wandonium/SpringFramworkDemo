package AnnotationsBased;

/**
 *
 * @author Hillary Wando
 */
public class Student implements School {
    public void learn() {
        System.out.println("Student is learning...");
    }

    @Override
    public void inSchool() {
        learn();
    }
}
