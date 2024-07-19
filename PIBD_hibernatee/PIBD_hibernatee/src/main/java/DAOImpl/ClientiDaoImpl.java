package DAOImpl;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Clienti;
import DAO.ClientiDao;
public class ClientiDaoImpl implements ClientiDao{
	public void adaugaClient(Clienti client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(client);
		transaction.commit();
		session.close();
	}
	public List<Clienti> afiseazaClient() {
		List<Clienti> listaClienti = new ArrayList();
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.query.Query query = session.createQuery("From Clienti");
		listaClienti = query.list();
		return listaClienti;
	}
	public void modificaClient(int idclient, String nume, String prenume, String email, String nrtelefon, String datacheckin, String datacheckout) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Clienti detaliiclienti = (Clienti) session.load(Clienti.class, idclient);
		detaliiclienti.setnume(nume);
		detaliiclienti.setprenume(prenume);
		detaliiclienti.setemail(email);
		detaliiclienti.setnrtelefon(nrtelefon);
		detaliiclienti.setdatacheckin(datacheckin);
		detaliiclienti.setdatacheckout(datacheckout);
		session.update(detaliiclienti);
		transaction.commit();
		session.close();
	}
	public void stergeClient(Clienti client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(client);
		transaction.commit();
		session.close();
	}
}