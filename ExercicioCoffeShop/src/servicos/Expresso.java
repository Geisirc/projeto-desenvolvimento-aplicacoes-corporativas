package servicos;

public class Expresso extends Bebida{
	
	public Expresso(){
		description = "EXPRESSO";
	}

	@Override
	public double cost() {
		return 1.99f;
	}

	
}
