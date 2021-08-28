package Criar_Smartphone;

public class Projeto_Smatphone {
	public static void main(String[] args) {
		
	Smartphone celular = new Smartphone();
	celular.modelo="Iphone";
	celular.cor="Branca";
	celular.camera=86;
	celular.memoria=500;
	celular.bateria=" Grafeno Long Life";
	celular.valor=15.000;
	celular.ligarAparelho = true;
	celular.destravarAparelho = true;
	celular.fazerChamada = false;
	celular.status();
	celular.ligar();
	celular.destravar();
	celular.chamada();
	
		
		
		
		
	}

}
