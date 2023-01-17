Algoritmo "Exercício 2 - Paridade"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Algoritmo identificador de paridade
// Autor(a) : Jaisla Ataídes
// Data atual : 08/11/2021

Var
   numero:inteiro
   par:logico

Inicio

   Escreval ("Insira um número cuja paridade será verificada:")
   Leia (numero) //entrada de dados
   Se (numero % 2 = 0) entao //condicional que verifica se a divisão por 2 deixa resto
      par<-verdadeiro
      escreval ("O número inserido é par.") //se for par essa mensagem será mostrada
   senao
      par<-falso
      escreval ("O número inserido é ímpar.")//senão for par, essa mensagem será mostrada
   fimse
Fimalgoritmo
