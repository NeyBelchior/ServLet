package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeDaEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
	    empresa.setNome(nomeDaEmpresa);
		
		Banco banco = new Banco();
		banco.adciona(empresa);  
		
		
		System.out.println("Cadastrando nova empresa");
	
		
	RequestDispatcher rd	=  request.getRequestDispatcher("novaEmpresaCadastrada.jsp");
	request.setAttribute("empresa", empresa.getNome());	
	rd.forward(request, response);
		
		
	}

}
