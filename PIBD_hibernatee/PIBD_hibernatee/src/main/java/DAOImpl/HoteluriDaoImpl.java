package DAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Hoteluri;
import DAO.HoteluriDao;
import java.util.Date;
import pojo.Camere;
import pojo.Clienti;
public class HoteluriDaoImpl implements HoteluriDao{
	public void adaugaHotel(Hoteluri hotel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(hotel);
		transaction.commit();
		session.close();
	}
	public List<Hoteluri> afiseazaHotel() {
		List<Hoteluri> listaHotel = new ArrayList();
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Query query = session.createQuery("From Hoteluri");
		listaHotel = query.list();
		return listaHotel;
	}
	public void modificaHotel(Integer idhotel, Camere camera, Clienti client, String numehotel, String oras, String nrstele, String animaledecompanie) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Hoteluri detaliihotel;
		detaliihotel = (Hoteluri) session.load(Hoteluri.class, idhotel);
		detaliihotel.setCamere(camera);
		detaliihotel.setClienti(client);
		detaliihotel.setnumehotel(numehotel);
		detaliihotel.setoras(oras);
		detaliihotel.setnrstele(nrstele);
		detaliihotel.setanimaledecompanie(animaledecompanie);
		session.update(detaliihotel);
		transaction.commit();
		session.close();
	}
	public void stergeHotel(Hoteluri hotel) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(hotel);
		transaction.commit();
		session.close();
	}
}