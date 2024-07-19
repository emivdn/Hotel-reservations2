package DAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Camere;
import DAO.CamereDao;
public class CamereDaoImpl implements CamereDao{
	public void adaugaCamera(Camere camera) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(camera);
		transaction.commit();
		session.close();
	}
	public List<Camere> afiseazaCamera() {
		List<Camere> listaCamere = new ArrayList();
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Query query = session.createQuery("From Camere");
		listaCamere = query.list();
		return listaCamere;
	}
	public void modificaCamera(int idcamera, String tipcamera, String capacitate, String pretnoapte, String disponibilitate, String facilitati, String dataultimeicuratari) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Camere detaliicamere = (Camere) session.load(Camere.class, idcamera);
		detaliicamere.settipcamera(tipcamera);
		detaliicamere.setcapacitate(capacitate);
		detaliicamere.setpretnoapte(pretnoapte);
		detaliicamere.setdisponibilitate(disponibilitate);
		detaliicamere.setfacilitati(facilitati);
		detaliicamere.setdataultimeicuratari(dataultimeicuratari);
		session.update(detaliicamere);
		transaction.commit();
		session.close();
	}
	public void stergeCamera(Camere camera) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(camera);
		transaction.commit();
		session.close();
	}
}