package Criar_Espingarda;

public class ProjetoEspingarda {

	public static void main(String[] args) {
		Espingarda arma = new Espingarda();
		arma.modelo =  "Bump Boito";
		arma.cor = "Niquelada";
		arma.calibre = 12;
		arma.capacidade = "7+1 munições";
		arma.peso = 3.640f;
		arma.carregada = true;
		arma.engatilhada = false;
		arma.carregar();
		arma.atirar();
		arma.status();
		
		

	}

}





