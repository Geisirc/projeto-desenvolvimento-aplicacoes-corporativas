package observer;

import java.util.Observable;

public class PrevisaoTempo implements java.util.Observer, ExibirElemento {
	
	Observable observable;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public PrevisaoTempo(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	

	public void exibir() {
		String textTemp = temperatura + " ºC E ";
		String textUmid = umidade + " DE UMIDADE ";
		String textPres = "COM " + pressao + " DE PRESSÃO.";
		
		String previsao = textTemp + textUmid + textPres;
		System.out.println(previsao);
	}

	public void update(Observable obs, Object args) {
		if (obs instanceof ClimaDados) {
			ClimaDados climaDados = (ClimaDados)obs;
			this.temperatura = climaDados.getTemperatura() + 1.8f;
			this.umidade = climaDados.getUmidade() - 2.5f;
			this.pressao += climaDados.getPressao() + 0.55;
			exibir();
		}
		
	}

}
