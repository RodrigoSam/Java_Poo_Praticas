
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status() {
	System.out.println("Uma Caneta "+this.cor);
	System.out.println("Est� tampada? "+ this.tampada);
	System.out.println("Sua Ponta � "+this.ponta);
	System.out.println("Sua Carga est� em "+this.carga);
	System.out.println("Uma Caneta modelo "+this.modelo);
	}
	
	 void rabiscar() {
	 if (this.tampada==true) {
		 System.out.println("Erro!N�o posso rabiscar");
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