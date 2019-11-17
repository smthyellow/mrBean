package smthyellow.model.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import smthyellow.model.Start;

@Component
@PropertySource("classpath:moto.properties")
public class InjectPropertyFile implements Start {
    @Value("${value}")
    String sound;

    @Override
    public void start() {
        System.out.println(sound + "(From file)");
    }
}
