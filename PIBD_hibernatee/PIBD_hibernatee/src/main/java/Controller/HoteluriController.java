package Controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Camere;
import pojo.Clienti;
import pojo.Hoteluri;
import DAOImpl.HoteluriDaoImpl;
import DAOImpl.HibernateUtil;
import org.hibernate.Session;
public class HoteluriController extends HttpServlet {
	Hoteluri hotel = new Hoteluri();
	HoteluriDaoImpl hotelDaoImpl = new HoteluriDaoImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("adaugaHotel") != null) {
			Integer idcamera = java.lang.Integer.parseInt(request.getParameter("idcamera"));
			Integer idclient = java.lang.Integer.parseInt(request.getParameter("idclient"));
			Session session = HibernateUtil.getSessionFactory().openSession();
			Camere camera = (Camere) session.get(Camere.class, idcamera);
			Clienti client = (Clienti) session.get(Clienti.class, idclient);
			String numehotel = request.getParameter("numehotel");
			String oras = request.getParameter("oras");
			String nrstele = request.getParameter("nrstele");
			String animaledecompanie = request.getParameter("animaledecompanie");
			hotel.setCamere(camera);
			hotel.setClienti(client);
			hotel.setnumehotel(numehotel);
			hotel.setoras(oras);
			hotel.setnrstele(nrstele);
			hotel.setanimaledecompanie(animaledecompanie);
			hotelDaoImpl.adaugaHotel(hotel);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Hotel.jsp");
			rd.forward(request, response);
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("afiseazaHotel") != null) {
			List<Hoteluri> listaHotel = new ArrayList();
			listaHotel = hotelDaoImpl.afiseazaHotel();
			request.setAttribute("listaHotel", listaHotel);
			RequestDispatcher rd = request.getRequestDispatcher("tabela_Hoteluri.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("modificaHotel") != null) {
			Integer id1 = Integer.parseInt(request.getParameter("idhotel"));
			Integer idcamera = java.lang.Integer.parseInt(request.getParameter("idcamera"));
			Integer idclient = java.lang.Integer.parseInt(request.getParameter("idclient"));
			Session session = HibernateUtil.getSessionFactory().openSession();
			Camere camera = (Camere) session.get(Camere.class, idcamera);
			Clienti client = (Clienti) session.get(Clienti.class, idclient);
			String numehotel = request.getParameter("numehotel");
			String oras = request.getParameter("oras");
			String nrstele = request.getParameter("nrstele");
			String animaledecompanie = request.getParameter("animaledecompanie");
			hotelDaoImpl.modificaHotel(id1, camera, client, numehotel, oras, nrstele,animaledecompanie );
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Hotel.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("stergeHotel") != null) {
			Integer id2 = Integer.parseInt(request.getParameter("idhotel"));
			hotel.setIdhotel(id2);
			hotelDaoImpl.stergeHotel(hotel);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Hotel.jsp");
			rd.forward(request, response);
		}
	}
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}