package br.com.turma.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.modelo.Usuario;
import br.com.turma.simulabanco.Banco;

@WebServlet("/mostrar")
public class MostraUsuarioServlet extends HttpServlet {

@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	ArrayList<Usuario> usuarios = Banco.getUsuarios();
	
	request.setAttribute("usuarios", usuarios);
	RequestDispatcher rd = request.getRequestDispatcher("/fromMostraUsuarios.jsp");
	rd.forward(request, response);
}
	
}
