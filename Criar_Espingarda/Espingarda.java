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
		System.out.println("°O Modelo da sua espingarda é " +this.modelo);
		System.out.println("°A cor de sua espingarda é " + this.cor);
		System.out.println("°O calibre da sua espingarda é " + this.calibre);
		System.out.println("°A capacidade da sua espingarda é " + this.capacidade);
		System.out.println("°O peso da sua espingarda é " + this.peso+" Kgs");
		
	}
	
	
	void carregar(){
		if (carregada==true) {
			System.out.println("Sua Espingarda está carregada!");
		}else {
			System.out.println("Você precisa carregar");
		}
					
	}
	void atirar() {
		if (engatilhada == true && carregada == true) {
			System.out.println("Efetue o disparo");
		}else if (carregada==false && engatilhada == true) {
			System.out.println("Sua espingarda está engatilhada mas sem munição, desengatilhe e carregue!!");
		}else {
			System.out.println("Engatilhe antes de efetuar o disparo");
		}
		
	}
	
	
			

}
