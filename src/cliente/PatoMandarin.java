package cliente;

import grasnar.Grasno;
import voar.VooComAsas;

public class PatoMandarin extends Pato{
	 
	Grasno grasnoComp = new Grasno();
	VooComAsas vooComp = new VooComAsas();
	
	public PatoMandarin(){
		grasnoComp.grasnar();
		vooComp.voar();
	}
	
	public void exibir(){
		// Override do m�todo exibir da Classe Pato
		System.out.println("\nChamada do m�todo da Superclasse: ");
		super.exibir();
		System.out.println("Pato Mandarin: Qu�Qu� Qu�Qu�!!!");
		
	}
	
	public void realizarVoo(){
		System.out.println("Realizar Voo Pato Mandarin");
	}
	
	public void realizarGrasno(){
		System.out.println("Realizar Grasno Pato Mandarin");
	}


}
