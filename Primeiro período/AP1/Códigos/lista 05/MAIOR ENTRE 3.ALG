Algoritmo "maior entre 3"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : determina o valor maior entre três
// Autor(a) : Jaisla
// Data atual : 01/12/2021

Var
   a, b,c : inteiro

Inicio

   Escreva("Insira três valores:")
   Leia(a,b,c) //entrada de dados
   Se (a>b) e (a>c) entao //condicional para descobrir se a é maior
      Escreval ("O valor ",a," é o maior.")
   senao
      se (b>a) e (b>c) entao //condicional para descobrir se b é maior
         Escreval ("O valor ",b," é o maior.")
      senao
         se (c>a) e (c>b) entao //condicional para descobrir se c é maior
            Escreval("O valor ",c," é o maior.")
         senao
            Escreval("Os valores são iguais.") //mensagem se os valores forem iguais
         fimse
      fimse
   fimse
Fimalgoritmo