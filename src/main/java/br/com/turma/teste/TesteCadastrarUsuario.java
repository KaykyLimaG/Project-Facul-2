package br.com.turma.teste;

import java.util.Date;

import br.com.turma.modelo.Usuario;
import br.com.turma.modelo.UsuarioDao;

public class TesteCadastrarUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("João Almeida",new Date(),"JAlemida","Alemida123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.cadastrar(usuario);
		
		
	}

}
