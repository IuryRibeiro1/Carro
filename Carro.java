package Carros;

public class Carro {
	
	private long id;
	private String modelo;
	private String ano;

	public Carro(long i, String m, String a) {
		this.id = i;
		this.modelo = m;
		this.ano = a;
		
	}
	
	public long getid() {
		return this.id;
	}

	public void setid(long i) {
		this.id = i;
	}
	
	public String getmodelo() {
		return this.modelo;
	}
	
	public void setmodelo(String m) {
		this.modelo = m;
	}
	
	public String getano() {
		return this.ano;
	}
	
	public void setano(String a) {
		this.ano = a;
	}
}
