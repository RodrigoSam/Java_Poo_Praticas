package Criar_Smartphone;

public class Smartphone {
	
	String modelo;
	String cor;
	float memoria;
	String bateria;
	double camera;
	double valor;
	boolean ligarAparelho;
	boolean destravarAparelho;
	boolean fazerChamada;
	 void status() {
		 System.out.println("O modelo dom seu smart � " + this.modelo);
		 System.out.println("A cor do seu smart � " + this.cor);
		 System.out.println("A capacidade de mem�ria do seu smart � de " + this.memoria +" GB");
		 System.out.println("O modelo da bateria do seu smartphone � "+this.bateria);
		 System.out.println("Sua camera possui " + this.camera+" mega pixels");
		 System.out.format("O valor do seu smart � R$: %.3f\n" , this.valor);
                    }
	 void ligar() {
		 if (ligarAparelho == true ) {
			 System.out.println("Seu smartphone est� ligado");
		 }else if(ligarAparelho == false) {
			 System.out.println("Seu Smartphone est� desligado");
		       }else {
		    	   System.out.println("Ligue seu aparelho antes de continuar");
		       }
	               }
	 void destravar () {
		 if (destravarAparelho == true && ligarAparelho == true) {
			 System.out.println("Seu aparelho est� pronto para uso");
		 }else if(destravarAparelho == false && ligarAparelho == true) {
			 System.out.println("Destrave seu aparelho antes de usar");
		 }else {System.out.println("Ligue o aparelho");
			 
		 }
	 }
	 void chamada() {if (fazerChamada == false) {
		 System.out.print("");
	 }else if (ligarAparelho == true && destravarAparelho == true) {
			 System.out.println("Fa�a a chamada");
		 }else if(ligarAparelho == true && destravarAparelho == false) {
			 System.out.println("Destrave o aparelho antes de executar a chamada!");
		 }else {
			 System.out.print("Ligar o aparelho");
		 }
		 
		 
			 
		 }
	 

}

