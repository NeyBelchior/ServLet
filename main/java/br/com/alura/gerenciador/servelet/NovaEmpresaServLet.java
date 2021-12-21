package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServLet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeDaEmpresa = request.getParameter("nome");
		
		
		System.out.println("Cadastrando nova empresa");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>Empresa"+nomeDaEmpresa+"Cadastrada Com Sucesso!</body></html>");
		
	}

}
