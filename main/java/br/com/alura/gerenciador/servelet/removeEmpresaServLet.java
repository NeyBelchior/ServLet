package br.com.alura.gerenciador.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;


//@WebServlet("/removeEmpresa")
public class removeEmpresaServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String parametroId =request.getParameter("id");
	    Integer id = 	Integer.valueOf(parametroId);
	    
	    System.out.println(id);
	    Banco banco = new Banco();
	    banco.removeEmpresa(id);
	    
	    response.sendRedirect("listaEmpresasServlet");
		
	
	}

}
