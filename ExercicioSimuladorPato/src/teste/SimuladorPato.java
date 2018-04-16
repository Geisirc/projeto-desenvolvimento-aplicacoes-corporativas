package teste;

import cliente.ModeloPato;
import cliente.Pato;
import cliente.PatoMandarin;
import cliente.PatoSelvagem;

public class SimuladorPato {

	public static void main(String[] args) {
		
		// Classe teste para simular patos voadores 
		Pato pato1 = new PatoSelvagem();
		pato1.exibir();
		pato1.realizarVoo();
		pato1.realizarGrasno();
				
		Pato pato2 = new PatoMandarin();
		pato2.exibir();
		pato2.getVooComp();
			
		Pato patoModelo = new ModeloPato();
		patoModelo.exibir();
		patoModelo.ComFoguete();
		
	}

}
