package testeCaféShop;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;

import servicos.Bebida;
import servicos.Creme;
import servicos.Expresso;
import servicos.Leite;

public class CoffeShopTest {
	
	public static void main(String args[]) {
		
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		Bebida bebida = new Expresso();		
		System.out.println(bebida.getDescription() + " R$ " + decimal.format(bebida.cost()));
		
		Bebida expresso = new Expresso();
		expresso = new Leite(expresso);
		expresso = new Leite(expresso);
		expresso = new Creme(expresso);
		System.out.println(expresso.getDescription() + " R$ " + decimal.format(expresso.cost()));
		
		
	}
}
