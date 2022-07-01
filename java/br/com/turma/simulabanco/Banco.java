package br.com.turma.simulabanco;

import java.util.ArrayList;
import java.util.Date;

import br.com.turma.modelo.Usuario;

public class Banco {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static Integer codigo = 0;

	// BLOCO DE INICIALIZAÇÃO STATIC

	static {

		Usuario usuario1 = new Usuario("EduHard", new Date(846295200000L), "duduzin", "d123");
		Usuario usuario2 = new Usuario("Kayky Lima", new Date(962506800000L), "Kayky", "k123");
		;
		Usuario usuario3 = new Usuario("Ana Beatirix", new Date(399524400000L), "aninha", "d123");
		;
		Banco.adiciona(usuario1);
		Banco.adiciona(usuario2);
		Banco.adiciona(usuario3);

	}

	public static void adiciona(Usuario usuario) {
		usuario.setCodigo(++codigo);
		Banco.usuarios.add(usuario);
	}

	public static ArrayList<Usuario> getUsuarios() {
		return Banco.usuarios;

	}

}
