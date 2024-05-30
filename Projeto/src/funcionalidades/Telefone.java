package funcionalidades;

public class Telefone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	//métodos para reproduzir música
	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO " + musica);
		tocar();		
	}
	
	private void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}
	//métodos para reproduzir músicas
	
	
	//métodos para atender ligação
	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);	
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");	
	}

	@Override
	public void inicarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
	//métodos para atender ligação

	
	//métodos do navegador
	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO A PÁGINA " + url);	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}

}
