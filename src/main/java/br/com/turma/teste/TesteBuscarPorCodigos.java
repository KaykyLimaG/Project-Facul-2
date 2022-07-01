package br.com.turma.teste;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteBuscarPorCodigos {

	public static void main(String[] args) {

		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscarPorCodigo(5);

		System.out.println("Código: " + usuario.getCodigo());
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Data: " + usuario.getDataNascimento());
		System.out.println("Login: " + usuario.getLogin());
		System.out.println("Senha: " + usuario.getSenha());

		System.out.println("--------------------------");

	}

}