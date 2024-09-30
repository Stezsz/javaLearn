package ClassesInterface;
interface VeiculoMotorizado
{
	abstract void abastecer();
}

abstract class Veiculo
{
	abstract void acelerar();

	void parar()
	{
		System.out.println("Veículo parado");
	}
}

class Carro extends Veiculo implements VeiculoMotorizado
{
	void acelerar()
	{
		System.out.println("O carro está acelerando");
	}

	public void abastecer()
	{
		System.out.println("O carro foi abastecido");
	}
}

class Bicicleta extends Veiculo
{
	void acelerar()
	{
		System.out.println("A bicicleta está acelerando");
	}
}

public class TesteVeiculo {
	public static void main(String args[])
	{
		Carro carro = new Carro();
		Veiculo bicicleta = new Bicicleta();


		carro.acelerar();
		bicicleta.acelerar();
		carro.parar();
		carro.abastecer();
	}
}
