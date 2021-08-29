package aulas_java_poo;

public class Caneta {
	
	 private String modelo;
	 private float ponta;
	 private boolean tampada;
	 private String cor;
	 
	 public Caneta(String modelo, String cor, float ponta) { //este é o método construtor
		this.modelo= modelo;
		this.tampar();
		this.cor = cor;
		this.ponta = ponta;
		
		
	 }
	 
	 
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void tampar () {
	this.tampada = true;
	}
	public void destampar () {
	this.tampada=false;
	}
	public void status () {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("A cor da caneta é " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	 
	 
	 
	 
	 
	 
}
