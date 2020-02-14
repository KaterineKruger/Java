import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // Armazenar o indice selecionado
  indiceSelecionado;
  
  // Botão
  botaoCadastrar = true;

  // Campos de Texto
  formulario = new FormGroup({
    campoNome : new FormControl(''),
    campoEmail : new FormControl(''),
    campoIdade : new FormControl('')
  });
  

  // JSON
  pessoas = [];

  // Método de cadastro
  cadastrar(){
    this.pessoas.push(this.formulario.value);
    this.formulario.reset();

  }

  // Método de seleção
  selecionar(indice){
    this.indiceSelecionado = indice;
    this.formulario.setValue(this.pessoas[indice]);
    this.botaoCadastrar = false;
  }

  // Método cancelar
  cancelar(){
    this.botaoCadastrar = true;
    this.formulario.reset();
  }

  // Método alterar
  alterar(){
    this.pessoas[this.indiceSelecionado] = this.formulario.value;
    this.formulario.reset();
    this.botaoCadastrar = true;
  }

  // Método excluir
  excluir(){
    this.pessoas.splice(this.indiceSelecionado, 1);
    this.formulario.reset();
    this.botaoCadastrar = true;
  }

}
