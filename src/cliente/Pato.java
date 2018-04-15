package cliente;

import grasnar.GrasnoComportamento;
import voar.VooComFoguete;
import voar.VooComportamento;

public class Pato {
	
	VooComportamento vooComp;
	GrasnoComportamento grasnoComp;
	VooComFoguete vooFoguet;
	
	public void ComFoguete() {
		vooFoguet.voarComFoguete();
		System.out.println("Com foguete Em frente e Avanteeeeeeee! ihuuuuu! ");
	}
	
	public void realizarVoo(){
		vooComp.voar();
		System.out.println("Realizar Voo Pato");
	}
	
	public void realizarGrasno(){
		grasnoComp.grasnar();
		System.out.println("Realizar Grasno Pato");
	}
	
	public void nadar(){
		
	}
	
	public void exibir(){
		System.out.println("Pato... Quê Quê");
	}

	public VooComportamento getVooComp() {
		System.out.println("objeto VooComportamento");
		return vooComp;
	}

	public void setVooComp(VooComportamento vooComp) {
		this.vooComp = vooComp;
	}

	public GrasnoComportamento getGrasnoComp() {
		return grasnoComp;
	}

	public void setGrasnoComp(GrasnoComportamento grasnoComp) {
		this.grasnoComp = grasnoComp;
	}
	
}
