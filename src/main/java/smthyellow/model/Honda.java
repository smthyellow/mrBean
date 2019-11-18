package smthyellow.model;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Moto {
    @Override
    public String getModel(){
        return "GSX R 600";
    }
}
