import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ColaboradorService } from '../servico/colaborador.service';

@Component({
    selector: 'app-colaborador',
    templateUrl: './colaborador.component.html',
    styleUrls: ['./colaborador.component.css']
})

export class ColaboradorComponent implements OnInit {

  // Reactive Forms
  formulario = new FormGroup({
    nome: new FormControl(''),
    cargo: new FormControl(''),
    salario: new FormControl('')
  });

  // Botão
  botao = true;
  
  // Alerta
  alertaVisivel = false;
  alertaMensagem = '';

  // Construtor
  constructor(private servico:ColaboradorService){
    
  }

  ngOnInit(){}

  // Cadastrar Colaborador
  cadastrar():void{
    this.servico.cadastrarColaborador(this.formulario.value)
    .subscribe(retorno => {
      this.alertaVisivel = true;
      this.alertaMensagem = retorno.mensagem;
    });
  }

}
