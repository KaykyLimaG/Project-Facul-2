package br.com.turma.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.modelo.Usuario;
import br.com.turma.simulabanco.Banco;

@WebServlet("/alterar")
public class AlterarUsuarioServlet extends HttpServlet {

	Usuario usuario = null;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer codigo = Integer.valueOf(request.getParameter("codigo"));
		ArrayList<Usuario> usuarios = Banco.getUsuarios();

		for (int i = 0; i < usuarios.size(); i++) {
			Integer codigoDoVetor = usuarios.get(i).getCodigo();

			if (codigoDoVetor.equals(codigo)) {
				usuario = usuarios.get(i);

			}

		}

		request.setAttribute("usuario", usuario);
		RequestDispatcher rd = request.getRequestDispatcher("/FromAlterarUsuarios.jsp");
		rd.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("txtnome");
		Date dataNascimento = converterParaDate(request.getParameter("txtdatanascimento"));
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");

		usuario.setNome(nome);
		usuario.setDataNascimento(dataNascimento);
		usuario.setLogin(login);
		usuario.setSenha(senha);

		response.sendRedirect("mostrar");
		
	}

	private Date converterParaDate(String dataComoString) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Date dataFormatada = null;
		try {
			dataFormatada = sdf.parse(dataComoString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataFormatada;

	}
}