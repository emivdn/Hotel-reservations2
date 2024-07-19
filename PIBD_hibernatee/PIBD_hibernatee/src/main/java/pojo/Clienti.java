package pojo;
import java.util.HashSet;
import java.util.Set;
public class Clienti implements java.io.Serializable {
	private Integer idclient;
	private String nume;
	private String prenume;
	private String email;
	private String nrtelefon;
	private String datacheckin;
	private String datacheckout;
	private Set hotels = new HashSet(0);
	public Clienti() {
	}
	public Clienti(String nume, String prenume, String email, String nrtelefon, String datacheckin, String datacheckout, Set hotels) {
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.nrtelefon = nrtelefon;
		this.datacheckin = datacheckin;
		this.datacheckout = datacheckout;
		this.hotels = hotels;
	}

	public Integer getIdclient() {
		return this.idclient;
	}

	public void setIdclient(Integer idclient) {
		this.idclient = idclient;
	}
	public String getnume() {
		return this.nume;
	}

	public void setnume(String nume) {
		this.nume = nume;
	}
	public String getprenume() {
		return this.prenume;
	}

	public void setprenume(String prenume) {
		this.prenume = prenume;
	}
	public String getemail() {
		return this.email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	public String getnrtelefon() {
		return this.nrtelefon;
	}

	public void setnrtelefon(String nrtelefon) {
		this.nrtelefon = nrtelefon;
	}
	public String getdatacheckin() {
		return this.datacheckin;
	}

	public void setdatacheckin(String datacheckin) {
		this.datacheckin = datacheckin;
	}
	public String getdatacheckout() {
		return this.datacheckout;
	}

	public void setdatacheckout(String datacheckout) {
		this.datacheckout = datacheckout;
	}
	public Set gethotels() {
		return this.hotels;
	}

	public void sethotels(Set hotels) {
		this.hotels = hotels;
	}
}