package Heranca;

public class Escola {
	public static void main(String[] args) {
	
	Aluno a1 = new Aluno(null, null, null);
	
	a1.nome="Afonso";
	a1.cpf="4,87,1485";
	a1.telefone="981936456";
	System.out.printf("Aluno nome é %s cpf = %s", a1.nome, a1.cpf);
}

}