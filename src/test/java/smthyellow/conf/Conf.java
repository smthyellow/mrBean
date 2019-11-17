package smthyellow.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import smthyellow.model.impl.MotoJavaConfig;

@Configuration
public class Conf {
    @Bean
    MotoJavaConfig motoJavaConfig(){
        return new MotoJavaConfig();
    }
}
