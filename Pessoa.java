package Carros;

public class Pessoa {

	private long id;
	private String nome;
	 
	
	public Pessoa(long i, String n) {
		this.id = i;
		this.nome = n;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long i){
		this.id = i;
	}

	public String getnome() {
		return this.nome;
	}

	public void setnome(String n) {
		this.nome = n;
	}
}
