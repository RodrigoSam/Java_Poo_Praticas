package Criar_Espingarda;

public class Espingarda {
	String modelo ;
	String cor;
	int calibre;
	String capacidade;
	float peso; 
	boolean carregada;
	boolean engatilhada;
	void status(){
		System.out.println("�O Modelo da sua espingarda � " +this.modelo);
		System.out.println("�A cor de sua espingarda � " + this.cor);
		System.out.println("�O calibre da sua espingarda � " + this.calibre);
		System.out.println("�A capacidade da sua espingarda � " + this.capacidade);
		System.out.println("�O peso da sua espingarda � " + this.peso+" Kgs");
		
	}
	
	
	void carregar(){
		if (carregada==true) {
			System.out.println("Sua Espingarda est� carregada!");
		}else {
			System.out.println("Voc� precisa carregar");
		}
					
	}
	void atirar() {
		if (engatilhada == true && carregada == true) {
			System.out.println("Efetue o disparo");
		}else if (carregada==false && engatilhada == true) {
			System.out.println("Sua espingarda est� engatilhada mas sem muni��o, desengatilhe e carregue!!");
		}else {
			System.out.println("Engatilhe antes de efetuar o disparo");
		}
		
	}
	
	
			

}
