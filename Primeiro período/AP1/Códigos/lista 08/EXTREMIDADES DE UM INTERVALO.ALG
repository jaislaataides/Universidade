Algoritmo "extremidades de um intervalo"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Aqui você descreve o que o programa faz! (função)
// Autor(a) : Nome do(a) aluno(a)
// Data atual : 18/01/2022

Var
   x,y,aux,produtoprimos,multiplosdetres,contador,divisores:inteiro

Inicio

   produtoprimos<-1
   escreval("Digite dois números que representam extremidades de um intervalo")
   leia (x,y)
   enquanto (x=y) faca //tratamento de erro (usuário inseriu o mesmo número)
      limpatela
      escreval("Desculpe, os números são iguais e portanto não podem formar um
      intervalo.")
      escreval("")
      escreva("Por favor digite dois valores diferentes entre si:")
      leia (x,y)
   fimenquanto
   se (y<x) entao //usuário inseriu valor maior para x
      aux<-x
      x<-y
      y<-aux
   fimse
   para aux de x ate y faca
      se aux%3=0 entao
         multiplosdetres<-multiplosdetres+aux
      fimse
      para contador de 1 ate aux faca
         se aux%contador=0 entao
            divisores<-divisores+1
         fimse
      fimpara
      se divisores=2 entao
         produtoprimos<-produtoprimos*aux
      fimse
      divisores<-0
   fimpara
   escreval(" ")
   escreval("A soma dos elementos múltiplos de 3 é ",multiplosdetres)
   escreval(" ")
   escreval("O produto dos números primos desse intervalo é ",produtoprimos)

Fimalgoritmo