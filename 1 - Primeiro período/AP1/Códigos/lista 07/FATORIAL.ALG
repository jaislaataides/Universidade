Algoritmo "fatorial"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula ao fatorial de um número determinado pelo usuário
// Autor(a) : Jaisla
// Data atual : 19/12/2021

Var
   N,fatorial,M: inteiro

Inicio

   escreval("Insira o número cujo fatorial deseja calcular:")
   leia(n)
   m<-n
   fatorial<-1
   repita
      fatorial<-fatorial*m
      m<-m-1
   ate (m=1)
   escreval(N,"! = ",fatorial,".")

Fimalgoritmo