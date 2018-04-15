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
		// Override do método exibir da Classe Pato
		System.out.println("\nChamada do método da Superclasse: ");
		super.exibir();
		System.out.println("Pato Mandarin: QuáQuá QuáQuá!!!");
		
	}
	
	public void realizarVoo(){
		System.out.println("Realizar Voo Pato Mandarin");
	}
	
	public void realizarGrasno(){
		System.out.println("Realizar Grasno Pato Mandarin");
	}


}
