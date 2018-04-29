package observer;

import java.util.Observable;

public class CondicoesAtuais implements java.util.Observer, ExibirElemento {

	Observable observable;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	/**
	 * O construtor recebe o objeto ClimaDados (Subject) e o 
	 * usamos para registrar a exibição como um observador.
	 * */
	public CondicoesAtuais(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void exibir(){
		String textTemp = temperatura + " ºC E ";
		String textUmid = umidade + " DE UMIDADE ";
		String textPres = "COM " + pressao + " DE PRESSÃO.";
		
		String condicaoAtual = textTemp + textUmid + textPres;
		System.out.println(condicaoAtual);
		
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof ClimaDados) {
			ClimaDados climaDados = (ClimaDados)obs;
			this.temperatura = climaDados.getTemperatura();
			this.umidade = climaDados.getUmidade();
			this.pressao = climaDados.getPressao();
			exibir();

		}
	}

}
