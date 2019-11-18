package smthyellow.model;

import org.springframework.stereotype.Component;

@Component
public class Yamaha implements Moto {
    @Override
    public String getModel(){
        return "R1";
    }

}
