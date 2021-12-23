package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;


/**
 * Servlet implementation class NovaEmpresaServLet
 */
//@WebServlet("/novaEmpresa")
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
		String dataEmpresa = request.getParameter("data");
		
		Date dataAbertura =null;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		    dataAbertura =  sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			
			throw new ServletException(e);
		}
		
		
		Empresa empresa = new Empresa();
	    empresa.setNome(nomeDaEmpresa);
	    empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adciona(empresa);  
		request.setAttribute("empresa", empresa.getNome());	
		
		System.out.println("Cadastrando nova empresa");
	    
		response.sendRedirect("listaEmpresasServlet");
		
//	RequestDispatcher rd	=  request.getRequestDispatcher("/listaEmpresasServlet");
//	request.setAttribute("empresa", empresa.getNome());	
//	rd.forward(request, response);
		
		
	}

}
