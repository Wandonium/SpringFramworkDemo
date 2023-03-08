package JavaConfigBased;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
@Scope(scopeName = "prototype")
public class Player implements Team {
    
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Player{" + "teamName=" + teamName + '}';
    }

    @Override
    public void playing() {
        System.out.println("Player runs after ball...");
    }
    
}
