Algoritmo "�mpares"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Identifica os n�meros �mpares dentro de um intervalo determinado pelo usu�rio
// Autor(a) : Jaisla
// Data atual : 09/12/2021

Var
   N,M,somatoria:inteiro

Inicio

   escreva("Escreva o tamanho do intervalo da amostragem:")
   leia(N)
   enquanto (N<0) faca
      escreval (" ")
      escreva("Intervalo negativo n�o existe. Por favor, insira o valor novamente.")
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
   escreval("O somat�rio dos elementos �mpares do intervalo informado �:",somatoria)
   
   Fimalgoritmo