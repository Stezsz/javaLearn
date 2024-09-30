package ArrayList;
import java.util.ArrayList;

public class ListaNomes
{
	public static void main(String args[])
	{
		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("Stephan");
		nomes.add("Diogo");
		nomes.add("Aline");

		System.out.println("Lista de nomes: " + nomes);

		System.out.println("Tamanho da lista: " + nomes.size());
	}
}

