Algoritmo "Fibonacci com para"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula valor da sequencia fibonacci pela posi��o
// Autor(a) : Jaisla
// Data atual : 21/01/2022

Var
   fibonacci: vetor [1..500] de inteiro
   n1,n2,n,cont,auxiliar:inteiro

Inicio

   n1<-1
   n2<-1
   escreval("Insira a posi��o da sequ�ncia de fibonacci que deseja descobrir o valor: ")
   leia(n)
   fibonacci[1]<-1
   fibonacci[2]<-1
   para cont de 3 ate n faca
      fibonacci[cont]<-n1+n2
      auxiliar<-n2
      n1<-auxiliar
      n2<-fibonacci[cont]
   fimpara
   escreval (� �)
   escreva("O ",n,"� n�mero da sequencia fibonacci � ",fibonacci[n])

Fimalgoritmo