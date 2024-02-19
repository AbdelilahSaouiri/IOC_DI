package org.example.Pres;

import org.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("org.example.Dao","org.example.Metier");
        IMetier metier= context.getBean(IMetier.class);

        System.out.println("res :" +metier.calculer());
    }
}
