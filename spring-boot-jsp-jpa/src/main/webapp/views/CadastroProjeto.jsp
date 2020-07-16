<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css"
	href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css"></link>
<link rel="stylesheet" type="text/css"
	href="../static/bootstrap-3.3.5-dist/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="../static/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="../static/bootstrap-3.3.5-dist/css/bootstrap-theme.css"></link>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="{@/post_projeto}">
		<div class="form-group">
			<label for="nomeprojeto">Nome do Projeto</label> <input
				type="nomeProjeto" class="form-control" id="nomeProjeto"
				aria-describedby="nameHelp" placeholder="Nome do projeto"></input>
		</div>
		<div class="form-group">
			<label for="dataInicio">Data de inicio do Projeto</label> <input
				type="dataInicio" class="form-control" id="dataInicio"
				aria-describedby="dataInicio" placeholder="Data do projeto"></input>
		</div>
		<div class="form-group">
			<label for="previsaoTermino">Previsão de término do Projeto</label> <input
				type="previsaoTermino" class="form-control" id="previsaoTermino"
				aria-describedby="previsaoTermino"
				placeholder="Previsão de Término do projeto"></input>
		</div>
		<div class="form-group">
			<label for="dataFinal">Data de final do Projeto</label> <input
				type="dataFinal" class="form-control" id="dataFinal"
				aria-describedby="dataFinal" placeholder="Data final do projeto"></input>
		</div>

		<div class="form-group">
			<label for="orcamentoTotal">Orçamento do Projeto</label> <input
				type="orcamentoTotal" class="form-control" id="orcamentoTotal"
				aria-describedby="orcamentoTotal"
				placeholder="Orçamento total do projeto"></input>
		</div>
		<div class="form-group">
			<label for="nomeGerenteProjeto">Nome do Gerente do Projeto</label> <input
				type="nomeGerenteProjeto" class="form-control"
				id="nomeGerenteProjeto" aria-describedby="nomeGerenteProjeto"
				placeholder="Nome do responsável pelo projeto"></input>
		</div>


		<button type="submit" class="btn btn-primary">Enviar</button>
	</form>



	<script type="text/javascript"
		src="../static/bootstrap-3.3.5-dist/js/bootstrap.js"></script>
	<script type="text/javascript"
		src="../static/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="../static/bootstrap-3.3.5-dist/js/npm.js"></script>
	<script type="text/javascript" src="../static/lib/jquery-1.11.1.min.js"></script>

</body>
</html>