package br.com.william.testes;

public class Teste {
	
	public static void main(String[] args) {
		String nome;
		
		nome = teste("William");
		System.out.println(nome);
		
	}
	

	public static String teste(String nome){
		String nomeTratado = nome;
		
		if(nome.equals("William")){
			teste("galindo");
		}
		return nomeTratado;
	}
	
	
}
