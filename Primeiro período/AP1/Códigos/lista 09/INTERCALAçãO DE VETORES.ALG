Algoritmo "intercalação de vetores"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Obtém um vetor constituído pela intercalção de outros dois vetores
// Autor(a) : Jaisla Ataídes
// Data atual : 25/01/2022

Var
   a,b: vetor [1..5] de inteiro
   c: vetor [1..10] de inteiro
   contador,i,j:inteiro

Inicio

   a[1]<-3
   a[2]<-5
   a[3]<-8
   a[4]<-9
   a[5]<-1
   b[1]<-6
   b[2]<-15
   b[3]<-20
   b[4]<-23
   b[5]<-33
   i<-1
   j<-1
   escreval("VETOR A:")
   escreval("")
   para contador de 1 ate 5 faca
      se (contador=5) entao
         escreva(a[contador],".")
      senao
         escreva(a[contador],", ")
      fimse
   fimpara
   timer (3300)
   limpatela
   timer 0
   escreval("VETOR B:")
   escreval("")
   para contador de 1 ate 5 faca
      se (contador=5) entao
         escreva(b[contador],".")
      senao
         escreva(b[contador],", ")
      fimse
   fimpara
   timer (3300)
   limpatela
   timer 0
   para contador de 1 ate 10 faca
      se contador%2=1 entao
         c[contador]<-a[i]
         i<-i+1
      senao
         c[contador]<-b[j]
         j<-j+1
      fimse
   fimpara
   escreval("A seguir, a formação do vetor resultante da intercalação:")
   escreval("")
   escreval("VETOR C:")
   escreval("")
   para contador de 1 ate 10 faca
      se (contador=10) entao
         escreva(c[contador],".")
      senao
         escreva(c[contador],", ")
      fimse
   fimpara
   escreval(" ")
   escreval(" ")

Fimalgoritmo

