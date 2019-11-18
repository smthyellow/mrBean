package smthyellow.tasks;

import org.springframework.stereotype.Component;
import smthyellow.model.Start;

@Component
public class Task3MotoAnnotation implements Start {
        @Override
        public void start() {
            System.out.println("Vrrooom vrroom mothafucka! (Annotation)");

        }
}
