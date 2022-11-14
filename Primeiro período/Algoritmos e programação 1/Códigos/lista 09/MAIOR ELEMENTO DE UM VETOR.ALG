Algoritmo "maior elemento de um vetor"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Descobre o maior elemento de um vetor e armazena sua posição
// Autor(a) : Jaisla Ataídes
// Data atual : 24/01/2022

Var
   n: vetor [1..5] de inteiro
   maiorelemento,posicao,i,j:inteiro

Inicio

   para i de 1 ate 5 faca
      escreval("Insira um valor para o VETOR N {posição",i,"/5}")
      leia (n[i])
      limpatela
   fimpara
   para i de 1 ate 5 faca
      se (maiorelemento<n[i]) entao
         maiorelemento<-n[i]
         posicao<-i
      fimse
   fimpara
   escreval("")
   escreval("O maior número do vetor N é ",maiorelemento," e está na ",posicao,"° posição.")

Fimalgoritmo
