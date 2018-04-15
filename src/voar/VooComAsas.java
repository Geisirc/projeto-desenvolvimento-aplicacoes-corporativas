package voar;

public class VooComAsas implements VooComportamento{

	@Override
	public void voar() {
		// assinatura dos métodos da Interface VooComportamento
		System.out.print("Voando...");
	}

	@Override
	public void voarComFoguete() {
		// extensão da Inteface Voar Com Foguete
		System.out.println("Em frente e Avanteeeeeeee! ihuuuuu! ");
	}

}
