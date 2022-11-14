Algoritmo "ímpares"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Identifica os números ímpares dentro de um intervalo determinado pelo usuário
// Autor(a) : Jaisla
// Data atual : 09/12/2021

Var
   N,M,somatoria:inteiro

Inicio

   escreva("Escreva o tamanho do intervalo da amostragem:")
   leia(N)
   enquanto (N<0) faca
      escreval (" ")
      escreva("Intervalo negativo não existe. Por favor, insira o valor novamente.")
      escreva("Escreva o tamanho do intervalo da amostragem:")
      leia(N)
   fimenquanto
   limpatela
   enquanto (M<=N) faca
      se (M%2=1) entao
         somatoria<-somatoria+M
      fimse
      M<-M+1
   fimenquanto
   limpatela
   escreval("O somatório dos elementos ímpares do intervalo informado é:",somatoria)
   
   Fimalgoritmo