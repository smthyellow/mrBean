package smthyellow.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Start;
import smthyellow.model.Yamaha;

@Component
public class InjectField implements Start {
    @Autowired
    Yamaha yamaha;

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka! I'm " + yamaha.getModel() + "(Field)");
    }
}
