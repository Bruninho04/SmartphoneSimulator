package celular;

import funcionalidades.Telefone;

public class Iphone {

	public static void main(String[] args) {
		Telefone iphone15 = new Telefone();
		
		// Testando funções do telefone
	    iphone15.ligar("123456789");
	    iphone15.atender();
	    iphone15.inicarCorreioVoz();
	    System.out.println();
	    
	    // Testando funções do navegador de internet
	    iphone15.exibirPagina("www.exemplo.com");
	    iphone15.adicionarNovaAba();
	    iphone15.atualizarPagina();
	    System.out.println();

	    // Testando funções do reprodutor musical
	    iphone15.selecionarMusica("Minha Música Favorita");
	    iphone15.pausar();
	
	}

}
