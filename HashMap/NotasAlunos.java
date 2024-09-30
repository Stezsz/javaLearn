package HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class NotasAlunos
{
	public static void main(String args[])
	{
		HashMap<String, Integer> notas = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		notas.put("Stephan", 95);
		notas.put("Aline", 87);
		notas.put("Diogo", 13);

		System.out.print("Digite o nome do aluno para ver a nota: ");
		String nome = scanner.nextLine();

		if (notas. containsKey(nome))
		{
			System.out.println("Nota de " + nome + ": " + notas.get(nome));
		}
		else
		{
			System.out.println("Aluno não encontrado.");
		}
	}
}
