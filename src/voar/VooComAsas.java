package voar;

public class VooComAsas implements VooComportamento{

	@Override
	public void voar() {
		// assinatura dos m�todos da Interface VooComportamento
		System.out.print("Voando...");
	}

	@Override
	public void voarComFoguete() {
		// extens�o da Inteface Voar Com Foguete
		System.out.println("Em frente e Avanteeeeeeee! ihuuuuu! ");
	}

}
