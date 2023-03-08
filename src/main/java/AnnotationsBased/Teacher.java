package AnnotationsBased;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */

@Component
public class Teacher implements School {
    public void teach() {
        System.out.println("Teacher is teaching...");
    }

    @Override
    public void inSchool() {
        teach();
    }
}
