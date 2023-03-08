package demo;

import AnnotationsBased.School;
import AnnotationsBased.Student;
import AnnotationsBased.Teacher;
import JavaConfigBased.BeanConfig;
import JavaConfigBased.Coach;
import JavaConfigBased.Player;
import JavaConfigBased.Team;
import demo.XmlBased.Doctor;
import demo.XmlBased.Nurse;
import demo.XmlBased.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Hillary Wando
 */
public class SpringFrameworkDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        xmlBased(context);
        annotationsBased(context);
        javaConfigBased();
        
    }
    
    public static void xmlBased(ApplicationContext context) {
        //Doctor doctor = new Doctor();
        // Creating object using Spring's XML-based dependency injection.
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        
        // Making use of the XML id from the spring.xml resource
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();
        
        // Making use of the Staff interface
        Staff doctor2 = context.getBean(Doctor.class);
        doctor2.assist();
        
        Staff nurse2 = context.getBean(Nurse.class);
        nurse2.assist();
        
        // Dependency injection of class instance variable:
        System.out.println("doctor qualification: " + doctor.getQualification());
    }
    
    public static void annotationsBased(ApplicationContext context) {
        // Creating object using Spring's Annotations-based dependency injection.
        School teacher = context.getBean(Teacher.class);
        teacher.inSchool();
        
        School student = context.getBean(Student.class);
        student.inSchool();
    }
    
    public static void javaConfigBased() {
        // Make use of the Annotations context for Java based dependecy injection
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        Team coach = ctx.getBean(Coach.class);
        coach.playing();
        
        Team player = ctx.getBean(Player.class);
        player.playing();
    }
}
