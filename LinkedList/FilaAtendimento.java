package LinkedList;
import java.util.LinkedList;

public class FilaAtendimento
{
	public static void main(String args[])
	{
		LinkedList<String> fila = new LinkedList<>();

		fila.add("Stephan");
		fila.add("Aline");
		fila.add("Diogo");

		System.out.println("Fila: " + fila);

		String atendido = fila.removeFirst();
		System.out.println(atendido + " foi atendido");

		System.out.println("Fila após atendimento: " + fila);
	}
}
