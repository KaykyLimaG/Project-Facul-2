package br.com.turma.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.modelo.Usuario;
import br.com.turma.simulabanco.Banco;

@WebServlet("/excluir")
public class RemoverUsuarioServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer codigo = Integer.valueOf(request.getParameter("codigo"));

		ArrayList<Usuario> usuarios = Banco.getUsuarios();

		for (int i = 0; i < usuarios.size(); i++) {
			Integer codigoDoVetor = usuarios.get(i).getCodigo();

			if (codigoDoVetor.equals(codigo)) {
				usuarios.remove(i);
				break;
			}

		}

		
		response.sendRedirect("mostrar");

	}

}
