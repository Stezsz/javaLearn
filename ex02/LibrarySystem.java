package ex02;

interface Reservavel {
	void reservar();

	void cancelarReserva();
}

abstract class ItemBiblioteca {
	String titulo;
	boolean isEmprestado;
	boolean isReservado;

	public ItemBiblioteca(String titulo) {
		this.titulo = titulo;
		this.isEmprestado = false;
		this.isReservado = false;
	}

	abstract void emprestar();

	abstract void devolver();

	void mostrarDetalhes() {
		System.out.println("Título: " + titulo + " | Emprestado: " + isEmprestado + " | Reservado: " + isReservado);
	}
}

class Livro extends ItemBiblioteca implements Reservavel {
	public Livro(String titulo) {
		super(titulo);
	}

	public void reservar() {
		if (!isEmprestado && !isReservado) {
			System.out.println("Livro " + '"' + titulo + '"' + " foi reservado com sucesso.");
			isReservado = true;
		} else {
			System.out.println("Livro " + '"' + titulo + '"' + " não pode ser reservado.");
		}
	}

	public void cancelarReserva() {
		if (isReservado) {
			System.out.println("Reserva do livro " + '"' + titulo + '"' + " foi cancelada.");
			isReservado = false;
		} else {
			System.out.println("Livro " + '"' + titulo + '"' + " não está reservado.");
		}
	}

	void emprestar() {
		if (!isEmprestado && !isReservado) {
			System.out.println("Livro " + '"' + titulo + '"' + " foi emprestado.");
			isEmprestado = true;
		} else if (isReservado) {
			System.out.println("Livro " + '"' + titulo + '"' + " está reservado, não pode ser emprestado.");
		} else {
			System.out.println("Livro " + '"' + titulo + '"' + " já está emprestado.");
		}
	}

	void devolver() {
		if (isEmprestado) {
			System.out.println("Livro " + '"' + titulo + '"' + " foi devolvido.");
			isEmprestado = false;
		} else {
			System.out.println("Livro " + '"' + titulo + '"' + " não está emprestado.");
		}
	}
}

class Revista extends ItemBiblioteca {
	public Revista(String titulo) {
		super(titulo);
	}

	void emprestar() {
		if (!isEmprestado) {
			System.out.println("Revista " + '"' + titulo + '"' + " foi emprestada.");
			isEmprestado = true;
		} else {
			System.out.println("Revista " + '"' + titulo + '"' + " já está emprestada.");
		}
	}

	void devolver() {
		if (isEmprestado) {
			System.out.println("Revista " + '"' + titulo + '"' + " foi devolvida.");
			isEmprestado = false;
		} else {
			System.out.println("Revista " + '"' + titulo + '"' + " não está emprestada.");
		}
	}
}

public class LibrarySystem {
	public static void main(String[] args) {
		ItemBiblioteca[] itens = new ItemBiblioteca[2];
		itens[0] = new Livro("Livro1");
		itens[1] = new Revista("Revista1");

		for (ItemBiblioteca item : itens)
		{
			item.mostrarDetalhes();

			if (item instanceof Reservavel)
			{
				((Reservavel) item).reservar();
			}

			item.emprestar();
			item.mostrarDetalhes();
			item.devolver();
			item.mostrarDetalhes();
		}

	}
}
