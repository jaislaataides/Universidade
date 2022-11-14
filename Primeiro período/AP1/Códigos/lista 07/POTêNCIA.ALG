Algoritmo "potência"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula uma potenciação determinada pelo usuário
// Autor(a) : Jaisla
// Data atual : 19/12/2021

Var
   base, expoente,resultado,contador:inteiro

Inicio

   resultado<-1
   escreval("Insira a base da potência:")
   leia (base)
   escreval(" ")
   escreval("Insira o expoente dessa mesma potência")
   leia (expoente)
   repita
      resultado<-resultado*base
      contador<-contador+1
   ate(contador=expoente)
   escreval(" ")
   escreva("O resultado dessa potenciação é ",resultado,".")
   
Fimalgoritmo