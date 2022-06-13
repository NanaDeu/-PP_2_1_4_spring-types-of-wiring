package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    private Egg6 egg;

/*    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }*/

    @Autowired
    public void setEgg(Egg6 egg) {
        this.egg = egg;
    }
    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
