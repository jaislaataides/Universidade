Algoritmo "maior entre 3"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : determina o valor maior entre tr�s
// Autor(a) : Jaisla
// Data atual : 01/12/2021

Var
   a, b,c : inteiro

Inicio

   Escreva("Insira tr�s valores:")
   Leia(a,b,c) //entrada de dados
   Se (a>b) e (a>c) entao //condicional para descobrir se a � maior
      Escreval ("O valor ",a," � o maior.")
   senao
      se (b>a) e (b>c) entao //condicional para descobrir se b � maior
         Escreval ("O valor ",b," � o maior.")
      senao
         se (c>a) e (c>b) entao //condicional para descobrir se c � maior
            Escreval("O valor ",c," � o maior.")
         senao
            Escreval("Os valores s�o iguais.") //mensagem se os valores forem iguais
         fimse
      fimse
   fimse
Fimalgoritmo