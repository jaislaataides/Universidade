Algoritmo "produto de um vetor por b"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Multiplica todas as posi��es de um vetor por uma vari�vel
// Autor(a) : Jaisla Ata�des
// Data atual : 24/01/2022

Var
   s,produto: vetor [1..5] de inteiro
   b,contador:inteiro

Inicio

   escreval("Insira o valor da vari�vel B:")
   leia (b)
   para contador de 1 ate 5 faca
      escreval("")
      escreval("Insira um valor para o vetor {posi��o",contador,"/5}")
      leia (s[contador])
      limpatela
      produto[contador]<-s[contador]*b
   fimpara
   para contador de 1 ate 5 faca
      escreval("")
      escreva("O produto de ",s[contador]," por ",b," � ",produto[contador],".")
      escreval("")
      escreval("")
   fimpara

Fimalgoritmo