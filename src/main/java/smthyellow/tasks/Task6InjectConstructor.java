package smthyellow.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Honda;
import smthyellow.model.Start;
import smthyellow.model.Yamaha;

@Component
public class Task6InjectConstructor implements Start {
    Yamaha yamaha;

    public Task6InjectConstructor() {
    }

    @Autowired
    public Task6InjectConstructor(Yamaha yamaha) {
        this.yamaha = yamaha;
    }

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka! I'm " + yamaha.getModel() + "(Constructor)");
    }
}
