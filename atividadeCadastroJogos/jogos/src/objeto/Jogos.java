package objeto;

public class Jogos {

	private String nome;
	private String genero;
	
	public Jogos() {
	
	}
	
	
	public Jogos(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isBlank()) {
			System.out.println("Informe um nome válido! ");
			return;
		}
		this.nome = nome;
		
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		if(genero.isBlank()) {
			System.out.println("Informe um genero válido! ");
			return;
		}
		this.genero = genero;
	}
	
	
	
}
