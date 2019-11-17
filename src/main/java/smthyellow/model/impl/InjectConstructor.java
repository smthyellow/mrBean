package smthyellow.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Honda;
import smthyellow.model.Start;

@Component
public class InjectConstructor implements Start {
    Honda honda;

    public InjectConstructor() {
    }

    @Autowired
    public InjectConstructor(Honda honda) {
        this.honda = honda;
    }

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka! I'm " + honda.getModel() + "(Constructor)");
    }
}
