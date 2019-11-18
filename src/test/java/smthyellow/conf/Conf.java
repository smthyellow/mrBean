package smthyellow.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smthyellow.tasks.Task3MotoAnnotation;
import smthyellow.tasks.Task2MotoJavaConfig;

@Configuration
public class Conf {
    @Bean
    Task2MotoJavaConfig motoJavaConfig(){
        return new Task2MotoJavaConfig();
    }

    @Bean
    Task3MotoAnnotation motoAnnotation() {
        return  new Task3MotoAnnotation();
    }
}
