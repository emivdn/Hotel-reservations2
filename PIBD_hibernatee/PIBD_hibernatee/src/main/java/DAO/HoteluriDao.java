package DAO;
import java.util.List;
import pojo.Hoteluri;
import pojo.Camere;
import pojo.Clienti;
public interface HoteluriDao {
	public void adaugaHotel (Hoteluri hotel);
	public List<Hoteluri> afiseazaHotel();
	public void modificaHotel (Integer idhotel, Camere camera, Clienti client, String numehotel, String oras, String nrstele, String animaledecompanie);
	public void stergeHotel (Hoteluri hotel);
} 