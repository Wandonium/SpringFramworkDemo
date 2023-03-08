package JavaConfigBased;

import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
public class Player implements Team {

    @Override
    public void playing() {
        System.out.println("Player runs after ball...");
    }
    
}
