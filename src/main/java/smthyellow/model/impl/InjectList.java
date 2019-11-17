package smthyellow.model.impl;

import org.springframework.beans.factory.annotation.Autowired;
import smthyellow.model.Moto;
import smthyellow.model.Start;

import java.util.List;

public class InjectList implements Start {
    List<Moto> motoList;

    @Autowired
    public InjectList(List<Moto> motoList) {
        this.motoList = motoList;
    }

    @Override
    public void start() {
        System.out.println("Vrrooom vrroom mothafucka!");
        motoList.forEach(moto -> System.out.println(moto.getModel()));
        System.out.println("(List of Beans)");
    }
}
