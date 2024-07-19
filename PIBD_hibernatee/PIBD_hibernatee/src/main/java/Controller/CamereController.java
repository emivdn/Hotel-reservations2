package Controller;
import DAO.CamereDao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Camere;
import DAOImpl.CamereDaoImpl;
public class CamereController extends HttpServlet {
	Camere camera = new Camere();
	CamereDaoImpl cameraDaoImpl = new CamereDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("adaugaCamera") != null) {
			String tipcamera = request.getParameter("tipcamera");
			String capacitate = request.getParameter("capacitate");
			String pretnoapte = request.getParameter("pretnoapte");
			String disponibilitate = request.getParameter("disponibilitate");
			String facilitati = request.getParameter("facilitati");
			String dataultimeicuratari = request.getParameter("dataultimeicuratari");
			camera.settipcamera(tipcamera);
			camera.setcapacitate(capacitate);
			camera.setpretnoapte(pretnoapte);
			camera.setdisponibilitate(disponibilitate);
			camera.setfacilitati(facilitati);
			camera.setdataultimeicuratari(dataultimeicuratari);
			cameraDaoImpl.adaugaCamera(camera);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Camera.jsp");
			rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("afiseazaCamera") != null) {
			List<Camere> listaCamere = new ArrayList();
			listaCamere = cameraDaoImpl.afiseazaCamera();
			request.setAttribute("listaCamere", listaCamere);
			RequestDispatcher rd = request.getRequestDispatcher("tabela_Camere.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("modificaCamera") != null) {
			int id1 = Integer.parseInt(request.getParameter("idcamera"));
			String tipcamera = request.getParameter("tipcamera");
			String capacitate = request.getParameter("capacitate");
			String pretnoapte = request.getParameter("pretnoapte");
			String disponibilitate = request.getParameter("disponibilitate");
			String facilitati = request.getParameter("facilitati");
			String dataultimeicuratari = request.getParameter("dataultimeicuratari");
			cameraDaoImpl.modificaCamera(id1, tipcamera, capacitate, pretnoapte, disponibilitate, facilitati, dataultimeicuratari);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Camera.jsp");
			rd.forward(request, response);
		}
		if (request.getParameter("stergeCamera") != null) {
			int id2 = Integer.parseInt(request.getParameter("idcamera"));
			camera.setIdcamera(id2);
			cameraDaoImpl.stergeCamera(camera);
			RequestDispatcher rd = request.getRequestDispatcher("adauga_Camera.jsp");
			rd.forward(request, response);
		}
	}
	public String getServletInfo() {
		return "Short description";
	}
}