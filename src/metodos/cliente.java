package metodos;

public class cliente {
	private String nome;
	private String end;
	private int nId;
	private int idade;
	private int numCasa; // NUMERO DA CASA

	public cliente(String nome, String end, int nId, int idade, int numCasa) {
		super();
		this.nome = nome;
		this.end = end;
		this.nId = nId;
		this.idade = idade;
		this.numCasa = numCasa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getnId() {
		return nId;
	}

	public void setnId(int nId) {
		this.nId = nId;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumCasa() {
		return numCasa;
	}

	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}

	public void visualizar() {
		System.out.println("\n==========================");
		System.out.println("      DADOS DO CLIENTE      ");
		System.out.println("==========================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero de idetificação: " + this.nId);
		System.out.println("Endereço: " + this.end);
		System.out.println("Numero da casa: " + this.numCasa);
		System.out.println("Idade: " + this.idade);
	}

	public void alteraRua(String end) {
		this.setEnd(end);

	}
	
	public void alteraNcasa(int numCasa) {
		this.setNumCasa(numCasa);
	}

}
