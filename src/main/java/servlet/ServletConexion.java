package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Empleado;
import modelo.Persona;

/**
 * Servlet implementation class ServletConexion
 */
public class ServletConexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String sOpcion=request.getParameter("Opcion");
		
		if (sOpcion.equals("entrar")) {
			
		
			Persona oPersona = new Persona();
			oPersona.setsNombre("Esty");
			oPersona.setsDni("1111111111");
			oPersona.setcLetra('M');
			
			String name = request.getParameter("name");
		
			
			request.setAttribute("name", name);
			request.setAttribute("person", oPersona);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/entrada.jsp");
			requestDispatcher.forward(request, response);
			
		}else if (sOpcion.equals("salir")) {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("salida.jsp");
			requestDispatcher.forward(request, response);
		}
		
		
		
		
	}

}
