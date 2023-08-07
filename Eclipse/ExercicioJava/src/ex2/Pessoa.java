package ex2;

public class Pessoa {
	private String Nome;
	private String Email;
	private String Telefone;
	private Endereco e;
	
	
	public Pessoa(Pessoa p, Endereco e) {
		super();
		Nome = p.getNome();;
		Email = p.getEmail();
		Telefone = p.getTelefone();
		this.e = e;
	}
	public Pessoa() {
		
	}
	public Endereco getE() {
		return e;
	}
	public void setE(Endereco e) {
		this.e = e;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String toString(Pessoa p, Endereco c) {
		
		return "\nNome: " + p.getNome() + " ,Email: " + p.getEmail() + " ,Telefone: "+ p.getTelefone() + " ,Cidade: "+ c.getNomeCidade() + " ,Número: "+ c.getNumero()+" ,Rua: " + c.getRua();
	}
}
