Algoritmo "múltiplo de 10 , 5 e 2 simultaneamente"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Identifica se o número inserido pelo usuário é, simultaneamente, múltiplo de 10 , 5 e 2.
// Autor(a) : Jaisla Ataídes
// Data atual : 23/11/2021

Var
   numero : inteiro

Inicio

   Escreval ("Insira um número: ")
   leia (numero)
   Se numero%10=0 entao
      Escreval ("Esse número é múltiplo de 10 , 5 e 2 simultaneamente.")
      //pelos critérios de divisibilidade, um número que seja múltiplo de 10 é
      //automaticamente múltiplo de 2 e de 5
   senao
      se numero%5=0 entao
         Escreval ("Esse número é múltiplo de 5, mas não de 2 e nem de 10.")
      senao
         se numero%2=0 entao
            Escreval ("Esse número é múltiplo de 2, mas não de 5 e nem de 10.")
         senao
            Escreval ("Esse número não é múltiplo de 10, nem de 5 e nem de 2.")
         fimse
      fimse
   fimse
Fimalgoritmo