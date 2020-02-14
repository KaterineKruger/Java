import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InicioComponent } from './paginas/inicio/inicio.component';
import { SobreComponent } from './paginas/sobre/sobre.component';
import { Erro404Component } from './paginas/erro404/erro404.component';
import { ContatoComponent } from './paginas/contato/contato.component';

@NgModule({
  declarations: [
    AppComponent,
    InicioComponent,
    SobreComponent,
    Erro404Component,
    ContatoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
