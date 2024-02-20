package extension;

import dao.IDao;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service ");
        double temp=20000;
        return temp;
    }
}
