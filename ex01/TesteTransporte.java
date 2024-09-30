package ex01;

// Interface VeiculoMotorizado
interface VeiculoMotorizado
{
	void abastecer();
}

abstract class Transporte
{
	// Método abstrato
	abstract void iniciarViagem();

	// Método concreto
	void pararViagem()
	{
		System.out.println("Viagem parada");
	}
}

// Classe Ônibus que estende Transporte e implementa VeiculoMotorizad
class Onibus extends Transporte implements VeiculoMotorizado
{
	void iniciarViagem()
	{
		System.out.println("Ônibus iniciando a viagem");
	}

	public void abastecer()
	{
		System.out.println("Ônibus sendo abastecido");
	}
}

// Classe Bicicleta que estende Transporte
class Bicicleta extends Transporte
{
	void iniciarViagem()
	{
		System.out.println("Bicicleta iniciando a viagem");
	}
}

public class TesteTransporte
{
	public static void main(String[] args)
	{
		// Criando uma lista de diferentes tipos de transporte
		Transporte[] transportes = new Transporte[2];
		transportes[0] = new Onibus();
		transportes[1] = new Bicicleta();

		// Loop para iniciar a viagem de cada transporte
		for (Transporte transporte : transportes)
		{
			transporte.iniciarViagem();
			transporte.pararViagem();

			// Verifica se o transporte é motorizado
			if (transporte instanceof VeiculoMotorizado)
			{
				((VeiculoMotorizado) transporte).abastecer();
			}
		}
	}
}
