package voar;

public class VooNao implements VooComportamento{

	@Override
	public void voar() {
		// assinatura dos métodos da Interface VooComportamento
		System.out.println("VooNao");
		
	}

	@Override
	public void voarComFoguete() {
		// extensão da Inteface Voar Com Foguete
		System.out.println("Em frente e Avanteeeeeeee! ihuuuuu! ");
		
	}

}
