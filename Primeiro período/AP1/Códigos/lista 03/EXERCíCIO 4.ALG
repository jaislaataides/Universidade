Algoritmo "Exercício 4"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Identificar se o valor de entrada (com 4 casas) pode ter sua raiz igual à soma dos pares de seus algarismos
// Autor(a) : Jaisla Ataídes
// Data atual : 08/11/2021

Var
   numero, q1, q2, x: inteiro

Inicio

   Escreval ("O número 3025 possui a seguinte característica:")
   Escreval ("30+25 = 55")
   Escreval ("55^2 = 3025")
   Escreval (" ")    //descrição da função do algoritmo
   Escreval (" ")
   Escreval ("Insira um número para testar se há nele a mesma característica: ")
   Leia (numero)     //entrada de dados
   q1 <- numero \ 100    //separa os dois primeiros digitos
   q2 <- numero % 100    //separa os dois últimos algarismos
   x <- q1 + q2          //efetua a soma dos pares de algarismos
   se (x^2 = numero) entao //verifica se essa sooma é a raiz do número inicial
      limpatela ()
      Escreval (" ")
      Escreval ("Esse número demonstra a mesma característica do exemplo.") //saída de dados se a condição for verdadeira
   senao
      Limpatela()
      Escreval (" ")
      Escreval ("Esse número não demonstra a mesma característica do exemplo.") //saída de dados se a condição for falsa
   fimse
Fimalgoritmo