package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa {
	
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
	    
		response.sendRedirect("entrada?acao=ListaEmpresas");
		
	}
	

}
