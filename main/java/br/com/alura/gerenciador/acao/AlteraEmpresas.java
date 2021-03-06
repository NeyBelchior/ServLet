package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresas {
	
	public String executa(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		  
		System.out.println("Alterando empresa");
		String nomeDaEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
	    String paramId = request.getParameter("id");
	    Integer id = Integer.valueOf(paramId);
	    
	    
		
		Date dataAbertura =null;
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		    dataAbertura =  sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa empresa =banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeDaEmpresa);
		empresa.setDataAbertura(dataAbertura);
		

		 return "redirect:entrada?acao=ListaEmpresas";
	  }
	

}
