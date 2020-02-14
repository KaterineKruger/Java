import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // Variáveis
  titulo = "Aprendendo Angular";
  exibir = false;

  // Vetor
  cursos = ["JAVA", "PHP", "C#", "ANGULAR"];

  // JSON
  produtos = [
    {"nome":"Galaxy S10", "marca":"Samsung"},
    {"nome":"iPhone 11", "marca":"Apple"}
  ];

  //Funções
  funcao(){
    this.exibir = !this.exibir;
  }
}
