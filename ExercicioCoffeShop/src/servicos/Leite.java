package servicos;

public class Leite extends CondimentoDecorador{

	Bebida bebida;
	
	public Leite(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String getDescription() {
		return bebida.getDescription() + ", LEITE";
	}

	public double cost() {
		return bebida.cost() + .50;
	}

}
