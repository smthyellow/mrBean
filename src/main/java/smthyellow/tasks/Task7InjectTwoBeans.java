package smthyellow.tasks;

import org.springframework.beans.factory.annotation.Qualifier;
import smthyellow.model.Moto;
import smthyellow.model.Start;

public class Task7InjectTwoBeans implements Start {
    Moto honda;
    Moto yamaha;

    public Task7InjectTwoBeans(@Qualifier("honda") Moto honda, @Qualifier("yamaha") Moto yamaha) {
        this.honda = honda;
        this.yamaha = yamaha;
    }

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka! I'm " + honda.getModel()
                + "Vrrooom vrroom mothafucka! I'm " + yamaha.getModel() + " (TwoBeans)");
    }
}
