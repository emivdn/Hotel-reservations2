package pojo;
public class Hoteluri implements java.io.Serializable {
	private Integer idhotel;
	private Camere camere;
	private Clienti clienti;
	private String numehotel;
	private String oras;
	private String nrstele;
	private String animaledecompanie;
	public Hoteluri() {
	}
	public Hoteluri(Camere camere, Clienti clienti, String numehotel, String oras, String nrstele, String animaledecompanie) {
		this.camere = camere;
		this.clienti = clienti;
		this.numehotel = numehotel;
		this.oras = oras;
		this.nrstele = nrstele;
		this.animaledecompanie = animaledecompanie;
	}

	public Integer getIdhotel() {
		return this.idhotel;
	}

	public void setIdhotel(Integer idhotel) {
		this.idhotel = idhotel;
	}
	public Camere getCamere() {
		return this.camere;
	}

	public void setCamere(Camere camere) {
		this.camere = camere;
	}
	public Clienti getClienti() {
		return this.clienti;
	}

	public void setClienti(Clienti clienti) {
		this.clienti = clienti;
	}
	public String getnumehotel() {
		return this.numehotel;
	}

	public void setnumehotel(String numehotel) {
		this.numehotel = numehotel;
	}
	public String getoras() {
		return this.oras;
	}

	public void setoras(String oras) {
		this.oras = oras;
	}
	public String getnrstele() {
		return this.nrstele;
	}

	public void setnrstele(String nrstele) {
		this.nrstele = nrstele;
	}
	public String getanimaledecompanie() {
		return this.animaledecompanie;
	}

	public void setanimaledecompanie(String animaledecompanie) {
		this.animaledecompanie = animaledecompanie;
	}
}