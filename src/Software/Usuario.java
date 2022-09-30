package Software;

public class Usuario {
	
	private static int contar = 1;
	
	private String nome;
	private String cpf;
	private String email;
	
	
	public Usuario(String nome, String cpf, String email) {
        
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		contar += 1;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() + 
				"\nCPF: " + this.getCpf() + 
				"\nEmail " + this.getEmail();
	}

	

}
