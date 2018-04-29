package observer;


public class TestEstacaoMeteorologica {
	
	public static void main(String[] args) {
		
		ClimaDados climaDados = new ClimaDados();
		climaDados.setMedidas(20, 78, 67);//Envia os dados		
		
		CondicoesAtuais condicoesAtuais = new CondicoesAtuais(climaDados);
		System.out.println("CONDI�ES ATUAIS");
		condicoesAtuais.update(climaDados, condicoesAtuais);
		
		
		PrevisaoTempo previsao = new PrevisaoTempo(climaDados);
		System.out.println("PREVIS�O");
		previsao.update(climaDados, previsao);
	
		
		
		}
}
