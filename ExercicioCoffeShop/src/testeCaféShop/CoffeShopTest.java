package testeCaféShop;

import servicos.Bebida;
import servicos.Creme;
import servicos.Expresso;
import servicos.Leite;

public class CoffeShopTest {
	
	public static void main(String args[]) {
		
		Bebida bebida = new Expresso();		
		System.out.println(bebida.getDescription() + " R$ " + bebida.cost());
		
		Bebida expresso = new Expresso();
		expresso = new Leite(expresso);
		expresso = new Leite(expresso);
		expresso = new Creme(expresso);
		System.out.println(expresso.getDescription() + " R$ " + expresso.cost());
		
		
	}
}
