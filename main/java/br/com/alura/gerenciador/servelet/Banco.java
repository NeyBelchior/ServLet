package br.com.alura.gerenciador.servelet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista= new ArrayList<>();
	public void adciona(Empresa empresa) {
		
		lista.add(empresa);
		
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
