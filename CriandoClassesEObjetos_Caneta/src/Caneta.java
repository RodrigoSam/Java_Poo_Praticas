
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
	System.out.println("Uma Caneta "+this.cor);
	System.out.println("Está tampada? "+ this.tampada);
	System.out.println("Sua Ponta é "+this.ponta);
	System.out.println("Sua Carga está em "+this.carga);
	System.out.println("Uma Caneta modelo "+this.modelo);
	}
	
	 void rabiscar() {
	 if (this.tampada==true) {
		 System.out.println("Erro!Não posso rabiscar");
	 }else {
		 System.out.println("Estou Rabiscando!");
	 }
}
	 void tampar( ) {
		this.tampada=true; 
	 }
	 void destampar() {
		this.tampada=false; 
	 }
}