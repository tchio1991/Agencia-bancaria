package Software;

import javax.swing.JOptionPane;

import utilitarios.Utilidades;

public class Conta {

	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Usuario usuario;
	private Double saldo = 0.0;
	
	public Conta(Usuario usuario) {
		this.numeroConta = contadorDeContas;
		this.usuario = usuario;
	    contadorDeContas += 1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "\nNumero da conta: " + this.getNumeroConta() +
		       "\nNome: " + this.usuario.getNome() +
		       "\nCPF: " + this.usuario.getCpf() +
		       "\nEmail: " + this.usuario.getEmail() +
		       "\nSaldo: " + Utilidades.doubleToSting(this.getSaldo()) + "\n";
	}
	
	
	public void depositar(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			JOptionPane.showMessageDialog(null, "Seu depositado foi realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel realizar o depósito!");
		}
	}
	
	public void sacar(Double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			JOptionPane.showMessageDialog(null, "Saque realizar com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel realizar o saque!");
		}
	}
	
	public void transferir(Conta contaParaDeposito, Double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			JOptionPane.showMessageDialog(null, "Transferencia realizado com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possivel realizar a transferência!");	
		    }
	    }
	
	
}
