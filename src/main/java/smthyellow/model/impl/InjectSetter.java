package smthyellow.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Honda;
import smthyellow.model.Start;

@Component
public class InjectSetter implements Start {
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
