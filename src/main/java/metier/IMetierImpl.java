package metier;
import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao; // couplage faible
    //private IDao dao1=new DaoImpl(); couplage fort
    @Override
    public double calcule() {
        double tmp= dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
   /*
    injecter dans la variable dao un objet d'une classe
    qui implemente l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
