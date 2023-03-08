package JavaConfigBased;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
public class Coach implements Team {

    @Override
    public void playing() {
        System.out.println("Coach yells at players....");
    }
    
}
