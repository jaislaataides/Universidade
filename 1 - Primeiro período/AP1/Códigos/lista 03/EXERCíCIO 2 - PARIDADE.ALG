Algoritmo "Exerc�cio 2 - Paridade"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Algoritmo identificador de paridade
// Autor(a) : Jaisla Ata�des
// Data atual : 08/11/2021

Var
   numero:inteiro
   par:logico

Inicio

   Escreval ("Insira um n�mero cuja paridade ser� verificada:")
   Leia (numero) //entrada de dados
   Se (numero % 2 = 0) entao //condicional que verifica se a divis�o por 2 deixa resto
      par<-verdadeiro
      escreval ("O n�mero inserido � par.") //se for par essa mensagem ser� mostrada
   senao
      par<-falso
      escreval ("O n�mero inserido � �mpar.")//sen�o for par, essa mensagem ser� mostrada
   fimse
Fimalgoritmo
