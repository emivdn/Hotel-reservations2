package DAO;
import java.util.List;
import pojo.Camere;
public interface CamereDao {
	public void adaugaCamera (Camere camera);
	public List<Camere> afiseazaCamera();
	public void modificaCamera (int idcamera, String tipcamera, String capacitate, String pretnoapte, String disponibilitate, String facilitati, String dataultimeicuratari);
	public void stergeCamera (Camere camera);
}