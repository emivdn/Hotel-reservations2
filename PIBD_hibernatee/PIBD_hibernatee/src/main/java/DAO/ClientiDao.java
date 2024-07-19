package DAO;
import java.util.List;
import pojo.Clienti;
public interface ClientiDao {
	public void adaugaClient (Clienti client);
	public List<Clienti> afiseazaClient();
	public void modificaClient (int idclient, String nume, String prenume, String email, String nrtelefon, String datacheckin, String datacheckout);
	public void stergeClient (Clienti client);
}