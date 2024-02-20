package Presentation;

import extension.DaoImpl2;
import metier.IMetierImpl;
//cette classe est ouvert a la modification a couse de la couplage fort
public class presentation {
    public static void main(String[] args) {
        /*
        Injection des dependances par
        instanciation statique => new (couplage fort)
        */
        //DaoImpl dao= new DaoImpl();  couplage fort
        DaoImpl2 dao= new DaoImpl2();  //couplage fort
        IMetierImpl metier=new IMetierImpl(dao); // couplage fort
        metier.setDao(dao); // l'injection des dependences
        System.out.println("Resultat: "+metier.calcule());
    }
}
