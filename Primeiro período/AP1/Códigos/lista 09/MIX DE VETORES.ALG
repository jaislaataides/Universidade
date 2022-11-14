Algoritmo "mix de vetores"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Cria vetores derivados da soma de elementos específicos do primeiro e todos
do segundo
// Autor(a) : Jaisla Ataídes
// Data atual : 27/01/2022

Var
   a,c,d:vetor[1..10] de inteiro
   b: vetor [1..5] de inteiro
   contador,contador2,contador3,vf1,vf2:inteiro

Inicio

   contador2<-1
   contador3<-1
   para contador de 1 ate 10 faca
      escreval("Insira o ",contador,"° número do vetor A.")
      leia (a[contador])
      limpatela
   fimpara
   para contador de 1 ate 5 faca
      escreval("Insira o ",contador,"° elemento do vetor B.")
      leia(b[contador])
      limpatela
   fimpara
   para contador de 1 ate 10 faca
      se a[contador]%2=0 entao
         c[contador2]<-a[contador]
         contador2<-contador2+1
      senao
         d[contador3]<-a[contador]
         contador3<-contador3+1
      fimse
   fimpara
   vf1<-contador2
   vf2<-contador3
   para contador de 1 ate 10 faca
      para contador2 de 1 ate 5 faca
         c[contador]<-c[contador]+b[contador2]
         d[contador]<-d[contador]+b[contador2]
      fimpara
   fimpara
   escreval("Vetor A:")
   escreval("")
   para contador de 1 ate 10 faca
      se (contador=10) entao
         escreva(a[contador],".")
      senao
         escreva(a[contador],", ")
      fimse
   fimpara
   timer (5000)
   timer 0
   limpatela
   escreval("Vetor B:")
   escreval("")
   para contador de 1 ate 5 faca
      se (contador=5) entao
         escreva(b[contador],".")
      senao
         escreva(b[contador],", ")
      fimse
   fimpara
   escreval("")
   escreval("")
   timer (5000)
   timer 0
   limpatela
   escreval("Vetor C:")
   escreval("")
   se vf1=1 entao
      escreval("Não foi inserido nenhum número par no vetor A.")
   senao
      se vf1=11 entao
         vf1<-10
         para contador de 1 ate vf1 faca
            se (contador=vf1) entao
               escreva(c[contador],".")
            senao
               escreva(c[contador],", ")
            fimse
         fimpara
      fimse
   fimse
   timer (5000)
   timer 0
   limpatela
   escreval("Vetor D:")
   escreval("")
   se vf2=1 entao
      escreval("Não foram digitados números ímpares no vetor A.")
   senao
      se vf2=11 entao
         vf2<-10
         para contador de 1 ate vf2 faca
            se (contador=vf2) entao
               escreva(d[contador],".")
            senao
               escreva(d[contador],", ")
            fimse
         fimpara
      fimse
   fimse
   escreval("")
   escreval("")
   escreval("")

Fimalgoritmo