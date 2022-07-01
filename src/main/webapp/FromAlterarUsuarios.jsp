<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.turma.modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar</title>
</head>
<body>
	<%
	Usuario usuario = (Usuario) request.getAttribute("usuario");
	%>
	<h1>Alteração dos Dados do Usuario</h1>

	<form method="post" action="alterar">

		Codigo: <input type="text" name="txtcodigo"
			value="${usuario.codigo }" readonly><br>
			
		<br> Nome: <input type="text" name="txtnome"
			value="${usuario.nome }"><br>
			
		<br> Data Nascimento: <input type="date" name="txtdatanascimento"
			value="${usuario.dataNascimento }" pattern="dd/MM/yyyy"><br>
			
		<br> Login: <input type="text" name="txtlogin"
			value="${usuario.login }"><br>
			
		<br> Senha: <input type="password" name="txtsenha"
			value="${usuario.senha }"><br>
			
		<br> <input type="submit" value="Salvar">
	</form>


</body>
</html>