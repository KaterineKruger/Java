<!-- Topo -->
<%@ include file="topo.jsp" %>


	<!-- Conteúdo -->
<main class="container paginaInicial">
	<div class="row">
		<div class="col-12 col-md-6">
			<h1>Seja bem vindo ao sistema!</h1>
		</div>
		<div class="col-12 col-md-6">
			<form>
				<p>Acessar conta</p>
				<input type="text" placeholder="E-Mail" class="form-control">
				<input type="password" placeholder="Senha" class="form-control">
				<input type="submit" class="btn btn-outline-primary">
			</form>
			<form>
				<p>Criar conta</p>
				<input type="text" placeholder="Nome" class="form-control">
				<input type="text" placeholder="E-Mail" class="form-control">
				<input type="password" placeholder="Senha" class="form-control">
				<input type="password" placeholder="Repetir Senha" class="form-control">
				<input type="submit" class="btn btn-outline-primary">
			</form>
		</div>	
	</div>
</main>

</body>
</html>