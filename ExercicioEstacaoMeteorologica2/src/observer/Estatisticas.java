package observer;

public class Estatisticas implements Observer, ExibirElemento{

	private float temperatura;
	private float umidade;
	private float pressao;
	
	public Estatisticas(ClimaDados climaDados) {
		temperatura = 23;
		umidade = 15;
		pressao = 45;
	}

	public void exibir() {
	
	}

	public void update(float temp, float umid, float pressao) {
		temperatura = temp * umid;
		umidade = umid - pressao;
		exibir();
	
	}
	
	

}
