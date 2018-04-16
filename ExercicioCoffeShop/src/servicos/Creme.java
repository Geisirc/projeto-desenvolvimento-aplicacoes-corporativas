package servicos;

public class Creme extends CondimentoDecorador{
	
	Bebida bebida;
	
	public Creme(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getDescription() {
		return bebida.getDescription() + ", CREME";
	}

	public double cost() {
		return bebida.cost() + .80;
	}

}
