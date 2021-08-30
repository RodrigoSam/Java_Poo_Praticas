package aulas_java_poo;

public class ContaBanco {
	public int numConta;
	protected String tipoConta;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("-------------------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("O tipo da conta é:" + this.getTipoConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("O saldo da conta é: " + this.getSaldo());
		System.out.println("O status da conta é: " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipoConta(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Parabéns conta aberta com sucesso!!!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("A conta possui valores e não pode ser fechada");
		} else if (this.getSaldo() < 0) {
			System.out.println("Você não pode fechar a conta pois possui débito");
		} else {
			this.setStatus(false);
			System.out.println("Sua conta foi fechada com suceso");
		}
	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("conta fechada/inexistente impossível depositar ");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}

	public void taxaMensal() {
		int vm = 0;
		if (this.getTipoConta() == "CC") {
			vm = 12;
		} else if (this.getTipoConta() == "CP") {
			vm = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - vm);
			{
				System.out.println("Mensalidade paga com sucesso por " + this.getDono());
			}
		} else {
			System.out.println("Impossível pagar");
		}
	}

	public ContaBanco(float saldo, boolean status) {
		this.setSaldo(0);
		this.setStatus(false);

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String t) {
		this.tipoConta = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}
}
	