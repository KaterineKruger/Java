//Vetor
var vetor = [];

//Cadastrar
function cadastrar() {
  //Obter os dados
  var nome = document.getElementById("nome").value;
  var email = document.getElementById("email").value;
  var cidade = document.getElementById("cidade").value;

  //Obter o local onde será exibida a mensagem
  var mensagem = document.getElementById("mensagem");

  //Validar campos
  var valida = validar(nome, email, cidade);
  if (valida == true) {
    //Validar e-mail repetido
    if (emailRepetido(email) == 1) {
      mensagem.innerHTML = "Favor utilizar outro e-mail";
      mensagem.classList.add("alert-danger");
    } else {
      //Adicionar ao vetor
      vetor.push({
        nome: nome,
        email: email,
        cidade: cidade
      });

      //Limpar os campos
      limpar();

      //Listar dados
      listar();

      //Mensagem e estilo
      mensagem.innerHTML = "Cadastro efetuado com sucesso!";
      mensagem.classList.remove("alert-danger");
      mensagem.classList.add("alert-success");
    }
  } else {
    //Mensagem e estilo
    mensagem.innerHTML = "Favor verificar os campos!";
    mensagem.classList.add("alert-danger");
  }

  //Remover mensagem
  setInterval(function() {
    mensagem.classList.remove("alert-danger");
    mensagem.classList.remove("alert-success");
    mensagem.innerHTML = "";
  }, 5000);
}

//Limpar campos
function limpar() {
  //Limpar campos
  document.getElementById("nome").value = "";
  document.getElementById("email").value = "";
  document.getElementById("cidade").value = "";

  //Exibir ou ocultar os botões
  document.getElementById("btnCadastrar").style.display = "inline-block";
  document.getElementById("btnAlterar").style.display = "none";
  document.getElementById("btnExcluir").style.display = "none";
  document.getElementById("btnCancelar").style.display = "none";

  //Cursor no campo nome
  document.getElementById("nome").focus();
}

//Listar todos os usuários
function listar() {
  //Selecionar a tabela
  var tabela = document.getElementById("tabela");

  //Limpar os dados contidos na tabela
  tabela.innerHTML = "";

  //Laço
  for (var indice = 0; indice < vetor.length; indice++) {
    //Criar linha na tabela
    var linha = tabela.insertRow(-1);

    //Criar colunas
    var coluna1 = linha.insertCell(0);
    var coluna2 = linha.insertCell(1);
    var coluna3 = linha.insertCell(2);
    var coluna4 = linha.insertCell(3);
    var coluna5 = linha.insertCell(4);

    //Adicionar dados
    coluna1.innerHTML = indice + 1;
    coluna2.innerHTML = vetor[indice].nome;
    coluna3.innerHTML = vetor[indice].email;
    coluna4.innerHTML = vetor[indice].cidade;
    coluna5.innerHTML =
      "<button class='btn btn-info' onclick='selecionar(" +
      indice +
      ")'>Selecionar</button>";
  }
}

//Selecionar usuário
function selecionar(indice) {
  //Exibir os dados do usuário
  document.getElementById("indice").value = indice;
  document.getElementById("nome").value = vetor[indice].nome;
  document.getElementById("email").value = vetor[indice].email;
  document.getElementById("cidade").value = vetor[indice].cidade;

  //Exibir ou ocultar botões
  document.getElementById("btnCadastrar").style.display = "none";
  document.getElementById("btnAlterar").style.display = "inline-block";
  document.getElementById("btnExcluir").style.display = "inline-block";
  document.getElementById("btnCancelar").style.display = "inline-block";
}

//Alterar dados
function alterar() {
  //Obter dados
  var indice = document.getElementById("indice").value;
  var nome = document.getElementById("nome").value;
  var email = document.getElementById("email").value;
  var cidade = document.getElementById("cidade").value;

  //Obter o local onde será exibida a mensagem
  var mensagem = document.getElementById("mensagem");

  //Validar campos
  var valida = validar(nome, email, cidade);
  if (valida == true) {
    //Alterar informações do usuário
    vetor[indice] = {
      nome: nome,
      email: email,
      cidade: cidade
    };

    //Limpar
    limpar();

    //Atualizar a tabela
    listar();
  } else {
    //Mensagem e estilo
    mensagem.innerHTML = "Favor verificar os campos!";
    mensagem.classList.add("alert-danger");
  }

  //Remover mensagem
  setInterval(function() {
    mensagem.classList.remove("alert-danger");
    mensagem.classList.remove("alert-success");
    mensagem.innerHTML = "";
  }, 5000);
}

//Excluir
function excluir() {
  //Obter o índice a ser removido
  var indice = document.getElementById("indice").value;

  //Remover do vetor
  vetor.splice(indice, 1);

  //Limpar campos
  limpar();

  //Atualizar a tabela
  listar();
}

//Validar campos
function validar(nome, email, cidade) {
  //Variável
  var valida = false;

  //Condicional
  if (nome != "" && email != "" && cidade != "") {
    //Nome
    if (nome.length >= 3) {
      valida = true;
    }

    //E-mail
    if (email.indexOf("@") == -1 || email.indexOf(".") == -1) {
      valida = false;
    }
  }

  //Retorno
  return valida;
}

//Validar e-mail repetido
function emailRepetido(email) {
  //Contador
  var contador = 0;

  //Laço
  for (var indice = 0; indice < vetor.length; indice++) {
    //Condicional
    if (vetor[indice].email == email) {
      contador++;
    }
  }

  //Retorno
  return contador;
}
