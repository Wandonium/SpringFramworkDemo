package JavaConfigBased;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 *
 * @author Hillary Wando
 */
@Component
public class Coach implements Team, BeanNameAware {
    
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Coach{" + "teamName=" + teamName + '}';
    }

    @Override
    public void playing() {
        System.out.println("Coach yells at players....");
    }

    // Bean lifecycle method. Called before bean is instantiated for the first time..
    @Override
    public void setBeanName(String string) {
        System.out.println("testing setBeanName lifecycle method call...");
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("testing postConstruct lifecycle method call...");
    }
    
}
