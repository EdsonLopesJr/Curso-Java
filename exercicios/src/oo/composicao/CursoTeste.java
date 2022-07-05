package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Edson");
		Aluno aluno2 = new Aluno("Junior");
		Aluno aluno3 = new Aluno("Jennifer");
		Aluno aluno4 = new Aluno("Ana");
		Aluno aluno5 = new Aluno("Flavia");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2022");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		
		aluno1.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso2);
		
		curso3.adicionarAluno(aluno5);
		curso3.adicionarAluno(aluno4);
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("Meu nome é : " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPornome("Java Completo");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome + " - " + cursoEncontrado.alunos);
		}
	}
}
