Algoritmo "Exerc�cio 4"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Identificar se o valor de entrada (com 4 casas) pode ter sua raiz igual � soma dos pares de seus algarismos
// Autor(a) : Jaisla Ata�des
// Data atual : 08/11/2021

Var
   numero, q1, q2, x: inteiro

Inicio

   Escreval ("O n�mero 3025 possui a seguinte caracter�stica:")
   Escreval ("30+25 = 55")
   Escreval ("55^2 = 3025")
   Escreval (" ")    //descri��o da fun��o do algoritmo
   Escreval (" ")
   Escreval ("Insira um n�mero para testar se h� nele a mesma caracter�stica: ")
   Leia (numero)     //entrada de dados
   q1 <- numero \ 100    //separa os dois primeiros digitos
   q2 <- numero % 100    //separa os dois �ltimos algarismos
   x <- q1 + q2          //efetua a soma dos pares de algarismos
   se (x^2 = numero) entao //verifica se essa sooma � a raiz do n�mero inicial
      limpatela ()
      Escreval (" ")
      Escreval ("Esse n�mero demonstra a mesma caracter�stica do exemplo.") //sa�da de dados se a condi��o for verdadeira
   senao
      Limpatela()
      Escreval (" ")
      Escreval ("Esse n�mero n�o demonstra a mesma caracter�stica do exemplo.") //sa�da de dados se a condi��o for falsa
   fimse
Fimalgoritmo