package Presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
/*
instanciation dunamique
   1-connaitre le nom de la classe
   2-charger la classe em memoire
   3-instancie la classe
*/
public class presentation2 {
    public static void main(String[] args) throws Exception {
            Scanner scanner=new Scanner(new File("configuration.txt"));
            String daoClassName=scanner.nextLine();
            Class cDao=Class.forName(daoClassName);// charger la classe en memoire
            IDao dao=(IDao) cDao.newInstance();// cree un objet de la classe (Instancie)
            String metierClasseName= scanner.nextLine();
            Class cMetier=Class.forName(metierClasseName);
            IMetier metier= (IMetier) cMetier.newInstance();
            Method method=cMetier.getMethod("setDao",IDao.class);//Recherche un methode
            method.invoke(metier,dao);//execution de methode
            // metier.setDao(dao) objet=metier, parametre=dao
            System.out.println("Resultat = "+metier.calcule());
    }
}
