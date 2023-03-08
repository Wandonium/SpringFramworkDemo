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
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        javaConfigBased(ctx);
        
        // Notice that the team name remains the same across both coach1 and coach2.
        // This is because of the default Spring Singleton scope.
        Coach coach1 = ctx.getBean(Coach.class);
        coach1.setTeamName("Manchester United");
        System.out.println(coach1);
        
        Coach coach2 = ctx.getBean(Coach.class);
        System.out.println(coach2);
        
        // We can change the scope to prototype to generate a different object
        // each time. Also make sure to the bean is a 'Component'.
        Player player1 = ctx.getBean(Player.class);
        player1.setTeamName("Marcus Rashford");
        System.out.println(player1);
        
        Player player2 = ctx.getBean(Player.class);
        System.out.println(player2);
        
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
    
    public static void javaConfigBased(ApplicationContext ctx) {
        // Make use of the Annotations context for Java based dependecy injection
        Team coach = ctx.getBean(Coach.class);
        coach.playing();
        
        Team player = ctx.getBean(Player.class);
        player.playing();
    }
}
