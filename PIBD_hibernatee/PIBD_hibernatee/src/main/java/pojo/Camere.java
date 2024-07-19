package pojo;
import java.util.HashSet;
import java.util.Set;
public class Camere implements java.io.Serializable {
	private Integer idcamera;
	private String tipcamera;
	private String capacitate;
	private String pretnoapte;
	private String disponibilitate;
	private String facilitati;
	private String dataultimeicuratari;
	private Set hotels = new HashSet(0);
	public Camere() {
	}
	public Camere(String tipcamera, String capacitate, String pretnoapte, String disponibilitate, String facilitati, String dataultimeicuratari, Set hotels) {
		this.tipcamera = tipcamera;
		this.capacitate = capacitate;
		this.pretnoapte = pretnoapte;
		this.disponibilitate = disponibilitate;
		this.facilitati = facilitati;
		this.dataultimeicuratari = dataultimeicuratari;
		this.hotels = hotels;
	}

	public Integer getidcamera() {
		return this.idcamera;
	}

	public void setIdcamera(Integer idcamera) {
		this.idcamera = idcamera;
	}
	public String gettipcamera() {
		return this.tipcamera;
	}

	public void settipcamera(String tipcamera) {
		this.tipcamera = tipcamera;
	}
	public String getcapacitate() {
		return this.capacitate;
	}

	public void setcapacitate(String capacitate) {
		this.capacitate = capacitate;
	}
	public String getpretnoapte() {
		return this.pretnoapte;
	}

	public void setpretnoapte(String pretnoapte) {
		this.pretnoapte = pretnoapte;
	}
	public String getdisponibilitate() {
		return this.disponibilitate;
	}

	public void setdisponibilitate(String disponibilitate) {
		this.disponibilitate = disponibilitate;
	}
	public String getfacilitati() {
		return this.facilitati;
	}

	public void setfacilitati(String facilitati) {
		this.facilitati = facilitati;
	}
	public String getdataultimeicuratari() {
		return this.dataultimeicuratari;
	}

	public void setdataultimeicuratari(String dataultimeicuratari) {
		this.dataultimeicuratari = dataultimeicuratari;
	}
	public Set gethotels() {
		return this.hotels;
	}

	public void sethotels(Set hotels) {
		this.hotels = hotels;
	}
}