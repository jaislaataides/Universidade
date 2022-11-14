Algoritmo "Fibonacci com para"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula valor da sequencia fibonacci pela posição
// Autor(a) : Jaisla
// Data atual : 21/01/2022

Var
   fibonacci: vetor [1..500] de inteiro
   n1,n2,n,cont,auxiliar:inteiro

Inicio

   n1<-1
   n2<-1
   escreval("Insira a posição da sequência de fibonacci que deseja descobrir o valor: ")
   leia(n)
   fibonacci[1]<-1
   fibonacci[2]<-1
   para cont de 3 ate n faca
      fibonacci[cont]<-n1+n2
      auxiliar<-n2
      n1<-auxiliar
      n2<-fibonacci[cont]
   fimpara
   escreval (“ ”)
   escreva("O ",n,"° número da sequencia fibonacci é ",fibonacci[n])

Fimalgoritmo