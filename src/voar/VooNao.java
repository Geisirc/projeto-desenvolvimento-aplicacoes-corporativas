package voar;

public class VooNao implements VooComportamento{

	@Override
	public void voar() {
		// assinatura dos m�todos da Interface VooComportamento
		System.out.println("VooNao");
		
	}

	@Override
	public void voarComFoguete() {
		// extens�o da Inteface Voar Com Foguete
		System.out.println("Em frente e Avanteeeeeeee! ihuuuuu! ");
		
	}

}
