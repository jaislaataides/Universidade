Algoritmo "IBGE"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Pesquisa de peso e altura por idade
// Autor(a) : Jaisla Ataídes
// Data atual : 18/01/2022

Var
   idade: vetor [1..5] de inteiro
   peso, altura: vetor[1..5] de real
   media,exclusividade,porcentagem:real
   contador: inteiro

Inicio

   para contador de 1 ate 5 faca
      escreval("Escreva a idade (",contador,"/5)")
      leia (idade[contador])
      media<-(media+idade[contador])/5
      escreval(" ")
      escreval("Escreva o peso (",contador,"/5)")
      leia (peso[contador])
      escreval(" ")
      escreval("Escreva a altura (",contador,"/5)")
      leia (altura[contador])
      limpatela
      se (peso[contador]>90) e (altura[contador]<1.50) entao
         exclusividade<-exclusividade+1
      senao
         se (idade[contador]>10) e (idade[contador]<30) e (altura[contador]>1.90) entao
            porcentagem<-porcentagem+1
         fimse
      fimse
      escreval(" ")
   fimpara
   porcentagem<-porcentagem*20
   escreval("A média da idade das 5 pessoas é de ",media," anos.")
   escreval(" ")
   escreval("Há ",exclusividade," pessoas que medem menos de 1,50m e pesam mais do que 90kg.")
   escreval(" ")
   escreval("A porcentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1,90m é de ",porcentagem,"%.")

Fimalgoritmo
