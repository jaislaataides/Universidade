Algoritmo "pot�ncia"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula uma potencia��o determinada pelo usu�rio
// Autor(a) : Jaisla
// Data atual : 19/12/2021

Var
   base, expoente,resultado,contador:inteiro

Inicio

   resultado<-1
   escreval("Insira a base da pot�ncia:")
   leia (base)
   escreval(" ")
   escreval("Insira o expoente dessa mesma pot�ncia")
   leia (expoente)
   repita
      resultado<-resultado*base
      contador<-contador+1
   ate(contador=expoente)
   escreval(" ")
   escreva("O resultado dessa potencia��o � ",resultado,".")
   
Fimalgoritmo