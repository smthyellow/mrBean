package smthyellow.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smthyellow.model.Moto;
import smthyellow.model.Start;

import java.util.List;
@Component
public class Task8InjectList implements Start {
    List<Moto> motoList;

    @Autowired
    public Task8InjectList(List<Moto> motoList) {
        this.motoList = motoList;
    }

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka!");
        motoList.forEach(moto -> System.out.println(moto.getModel()));
        System.out.println("(List of Beans)");
    }
}
