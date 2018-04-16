package servicos;

public abstract class Bebida {
	
	String description = "Bebida indefinida";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
