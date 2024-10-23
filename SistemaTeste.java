package entidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SistemaTeste {
	private Sistema sistema;
	private double notas[];
	private Aluno aluno;

	@BeforeEach
	void setup() {
		sistema = new Sistema();
		notas = new double[4];
		aluno = new Aluno("", notas);
		System.out.println("Sistema cadastrado com sucesso!");
	}

	@AfterEach
	void limparSistema() {
		sistema = null;
		aluno = null;
		notas = null;
		System.out.println("Sistema limpo com sucesso!");
	}

	@DisplayName("Teste Cadastro de Aluno")
	@Test
	void testeCadastraraluno() {
		double notas[] = { 7.5, 9.0, 5.0, 8.0 };
		assertEquals("Aluno cadastrado com sucesso!", sistema.cadastrarAluno("Alan", notas));

	}

	@DisplayName("Teste cadastro de aluno com o mesmo nome")
	@Test
	void testeAlunoComMesmoNome() {

		double notas[] = { 3.0, 4.0, 5.0, 6.0 };
		sistema.cadastrarAluno("Alan", notas);

		String resultado = sistema.cadastrarAluno("Alan", notas);
		assertEquals("Erro: Já existe um aluno cadastrado com esse nome. ", resultado);
	}

	@DisplayName("Teste Para Editar o nome do aluno")
	@Test
	void testeEditarNomeAluno() {
		double notas[] = { 7.5, 9.0, 5.0, 8.0 };
		sistema.cadastrarAluno("Alan", notas);

		sistema.editarNomeAluno("Alan", "Alan Ruiz");
		Aluno aluno = sistema.getAlunoPorNome("Alan Ruiz");
		assertEquals("Alan Ruiz", aluno.getNome());

	}

	@DisplayName("Teste para editar nome do aluno com um nome ja existente.")
	@Test
	void TesteEditarNomeAlunoParaNomeExistente() {
		double notas[] = { 7.5, 9.0, 5.0, 8.0 };
		sistema.cadastrarAluno("Alan", notas);

		sistema.editarNomeAluno("Alan", "Alan Ruiz");
		Aluno aluno = sistema.getAlunoPorNome("Alan Ruiz");
		assertEquals("Alan Ruiz", aluno.getNome());

		sistema.cadastrarAluno("Alan Roberto", notas);
		sistema.editarNomeAluno("Alan Roberto", "Alan Ruiz");
		assertEquals("Alan Ruiz", aluno.getNome());
	}

	@DisplayName("Teste para editar nota do aluno")
	@Test
	void TesteEditarNotaAluno() {
		double notas[] = { 7.5, 9.0, 5.0, 8.0 };
		sistema.cadastrarAluno("Alan", notas);

		sistema.editarNotaAluno("Alan", 2, 10.0);
		Aluno aluno = sistema.getAlunoPorNome("Alan");
		assertEquals(10.0, aluno.getNotas().get(2), 0.01);

	}
	@DisplayName("Teste para editar nota de aluno inexistente")
	@Test
	public void testEditarNotaAlunoInexistente() {

		sistema.editarNotaAluno("Pedro", 1, 8.0);

		Aluno aluno = sistema.getAlunoPorNome("Pedro");
		assertNull(aluno);
	}
	@DisplayName("Teste para gerar relatorio")
	 @Test
	    public void testeGerarRelatorio() {
	        double[] notas = {7.0, 8.5, 9.0, 6.5};
	        sistema.cadastrarAluno(" Alan", notas);

	        assertEquals("Nome : Alan\n"
	        		+ "Notas: [7.0, 8.5, 9.0, 6.5]\n"
	        		+ "Média: 7.75\n"
	        		+ "Situação: Aprovado\n"
	        		+ "----------------------------------------------------\n", sistema.gerarRelatório());
	        
	    }

}
