
public class Aps {
	
	private String nome, matricula;
	private int idade;
	
	public Aps (){
		this("Aluno", "0123456", 0);
	}
	public Aps(String n, String m, int i){
		this.nome = n;
		this.idade = i;
		this.matricula = m;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
