package Criar_caneta;

public class caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	public void status() {
	System.out.println("Uma Caneta "+this.cor);
	System.out.println("Está tampada? "+ this.tampada);
	System.out.println("Sua Ponta é "+this.ponta);
	System.out.println("Sua Carga está em "+this.carga);
	System.out.println("Uma Caneta modelo "+this.modelo);
	}
	
	 public void rabiscar() {
	 if (this.tampada==true) {
		 System.out.println("Erro!Não posso rabiscar");
	 }else {
		 System.out.println("Estou Rabiscando!");
	 }
}
	protected void tampar( ) {
		this.tampada=true; 
	 }
	protected void destampar() {
		this.tampada=false; 
	 }
}