package Controller;
import DAO.ClientiDao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Clienti;
import DAOImpl.ClientiDaoImpl;
public class ClientiController extends HttpServlet {
	Clienti client = new Clienti();
	ClientiDaoImpl clientDaoImpl = new ClientiDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("adaugaClient") != null) {
			String nume = request.getParameter("nume");
			String prenume = request.getParameter("prenume");
			String email = request.getParameter("email");
			String nrtelefon = request.getParameter("nrtelefon");
			String datacheckin = request.getParameter("datacheckin");
			String datacheckout = request.getParameter("datacheckout");
			client.setnume(nume);
			client.setprenume(prenume);
			client.setemail(email);
			client.setnrtelefon(nrtelefon);
			client.setdatacheckin(datacheckin);
			client.setdatacheckout(datacheckout);
			clientDaoImpl.adaugaClient(client);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Client.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("afiseazaClient") != null) {
			List<Clienti> listaClienti = new ArrayList();
			listaClienti = clientDaoImpl.afiseazaClient();
			request.setAttribute("listaClienti", listaClienti);
			RequestDispatcher rd = request.getRequestDispatcher("tabela_Clienti.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("modificaClient") != null) {
			int id1 = Integer.parseInt(request.getParameter("idclient"));
			String nume = request.getParameter("nume");
			String prenume = request.getParameter("prenume");
			String email = request.getParameter("email");
			String nrtelefon = request.getParameter("nrtelefon");
			String datacheckin = request.getParameter("datacheckin");
			String datacheckout = request.getParameter("datacheckout");
			clientDaoImpl.modificaClient(id1, nume, prenume, email, nrtelefon, datacheckin, datacheckout);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Client.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("stergeClient") != null) {
			int id2 = Integer.parseInt(request.getParameter("idclient"));
			client.setIdclient(id2);
			clientDaoImpl.stergeClient(client);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Client.jsp");
			rd.forward(request, response);
		}
	}
	public String getServletInfo() {
		return "Short description";
	}
}