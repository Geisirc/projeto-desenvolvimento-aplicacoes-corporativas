package observer;

public class TestEstacaoMeteorologica {
	
	public static void main(String[] args) {
		
		ClimaDados climaDados = new ClimaDados();
		
		CondicoesAtuais condicoesAtuais = new CondicoesAtuais(climaDados);
		Estatisticas estaticas = new Estatisticas(climaDados);
		//
		
		//Envia os dados
		climaDados.setMedidas(23, 47, 45);
		climaDados.notifyObserver();
	}

}
