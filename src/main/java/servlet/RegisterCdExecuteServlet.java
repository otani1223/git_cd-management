package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CdDAO;
import dto.Cd;

/**
 * Servlet implementation class RegisterCdExecuteServlet
 */
@WebServlet("/RegisterCdExecuteServlet")
public class RegisterCdExecuteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCdExecuteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Cd cd = (Cd)session.getAttribute("user");

		if(cd == null){
			String view = "./";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
			return;
		}

		request.setCharacterEncoding("UTF-8");
		String Name = request.getParameter("name");
		String Art = request.getParameter("art");
		String Price = request.getParameter("price");
		

		
		Cd Cd = new Cd(Name, Art, Price);
		
		int result = CdDAO.registerCd(Cd);

		String view = "";
		if(result==0) {
			view = "WEB-INF/view/cd-register.jsp?error=1";
		} else {
			view = "WEB-INF/view/cd-register-result.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
