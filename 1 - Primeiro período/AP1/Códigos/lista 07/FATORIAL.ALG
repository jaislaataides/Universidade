Algoritmo "fatorial"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula ao fatorial de um n�mero determinado pelo usu�rio
// Autor(a) : Jaisla
// Data atual : 19/12/2021

Var
   N,fatorial,M: inteiro

Inicio

   escreval("Insira o n�mero cujo fatorial deseja calcular:")
   leia(n)
   m<-n
   fatorial<-1
   repita
      fatorial<-fatorial*m
      m<-m-1
   ate (m=1)
   escreval(N,"! = ",fatorial,".")

Fimalgoritmo