package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationSpringXML {
    public static void main(String[] args) {
        ApplicationContext context= new  ClassPathXmlApplicationContext("applicationcontext.xml");
        IMetier metier= (IMetier) context.getBean("metier");
        System.out.println(metier.calcule());
    }
}
