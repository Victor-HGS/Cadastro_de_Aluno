package br.ed.eteczl.ProjetoMaven;

public class Principal {
	
	public static void main (String [] args)
	{
		IO io = new IO();
		
		Aluno aluno = new Aluno();
		
		DayTime dayTime = new DayTime();
		
		io.setTexto("Programa de Cadastro");
		
		io.exibirTexto();
		
		aluno.setNome(io.digitarTexto("Digite se nome: "));
		
		aluno.setIdade(Integer.parseInt(io.digitarTexto("Digite sua idade: ")));
		
		aluno.setFumante(Boolean.parseBoolean(io.digitarTexto("Digite true para fumante e false para não fumante: ")));
		
		
io.setTexto("Cadastro Realizado:\n\n" + 
		"Nome: " + aluno.getNome() + "\n" +
		"Idade: " + aluno.getIdade() + "\n" +
		"Fumante: " + aluno.isFumante() + "\n\n" +
		"Data: " + dayTime.getData() + "\n" +
		"Hora: " + dayTime.getHora()
		);	
	}
}
