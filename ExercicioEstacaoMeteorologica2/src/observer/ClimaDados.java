package observer;

import java.util.Observable;

public class ClimaDados extends Observable{
	
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public ClimaDados() {
	}

	public float getTemperatura() {
		return temperatura;
	}

	public float getUmidade() {
		return umidade;
	}

	public float getPressao() {
		return pressao;
	}

	// Aqui vamos apenas simular a Estação Metereorológica.
	// Podíamos pegar os dados da Web ;)
	public void setMedidas(float temp, float umid, float press) {
		temperatura = temp;
		umidade = umid;
		pressao = press;
		setChanged();
		notifyObservers();
	}
	
	
	
}
