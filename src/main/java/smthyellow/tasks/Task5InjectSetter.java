package smthyellow.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Honda;
import smthyellow.model.Start;

@Component
public class Task5InjectSetter implements Start {
    Honda honda;

    @Autowired
    public void setHonda(Honda honda) {
        this.honda = honda;
    }

    @Override
    public void start() {
        System.out.println(honda.getModel() + "(Setter)");
    }
}
