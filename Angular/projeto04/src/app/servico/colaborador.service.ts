import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Resposta } from '../modelo/resposta';
import { Colaborador } from '../modelo/colaborador';

@Injectable({
  providedIn: 'root'
})
export class ColaboradorService {

  // URL
  url:string = "http://localhost:8090/api/colaborador"

  // Construtor
  constructor(private requisicao:HttpClient) { }

  // Método Cadastrar
  cadastrarColaborador(c:Colaborador):Observable<Resposta>{
    return this.requisicao.post<Resposta>(this.url, c);
  }

  // Método Alterar
  alterarCliente(){

  }

  // Método Excluir
  excluirCliente(){

  }

  // Método Cancelar
  cancelarCliente(){

  }

}
