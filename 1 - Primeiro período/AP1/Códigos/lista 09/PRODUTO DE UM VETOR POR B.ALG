Algoritmo "produto de um vetor por b"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Multiplica todas as posições de um vetor por uma variável
// Autor(a) : Jaisla Ataídes
// Data atual : 24/01/2022

Var
   s,produto: vetor [1..5] de inteiro
   b,contador:inteiro

Inicio

   escreval("Insira o valor da variável B:")
   leia (b)
   para contador de 1 ate 5 faca
      escreval("")
      escreval("Insira um valor para o vetor {posição",contador,"/5}")
      leia (s[contador])
      limpatela
      produto[contador]<-s[contador]*b
   fimpara
   para contador de 1 ate 5 faca
      escreval("")
      escreva("O produto de ",s[contador]," por ",b," é ",produto[contador],".")
      escreval("")
      escreval("")
   fimpara

Fimalgoritmo