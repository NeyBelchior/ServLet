package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresas {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String parametroId =request.getParameter("id");
	    Integer id = 	Integer.valueOf(parametroId);
	    
	    System.out.println(id);
	    Banco banco = new Banco();
	    banco.removeEmpresa(id);
	    
	 return	"redirect:entrada?acao=ListaEmpresas";

}

	
}
