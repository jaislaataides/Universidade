Algoritmo "m�ltiplo de 10 , 5 e 2 simultaneamente"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Identifica se o n�mero inserido pelo usu�rio �, simultaneamente, m�ltiplo de 10 , 5 e 2.
// Autor(a) : Jaisla Ata�des
// Data atual : 23/11/2021

Var
   numero : inteiro

Inicio

   Escreval ("Insira um n�mero: ")
   leia (numero)
   Se numero%10=0 entao
      Escreval ("Esse n�mero � m�ltiplo de 10 , 5 e 2 simultaneamente.")
      //pelos crit�rios de divisibilidade, um n�mero que seja m�ltiplo de 10 �
      //automaticamente m�ltiplo de 2 e de 5
   senao
      se numero%5=0 entao
         Escreval ("Esse n�mero � m�ltiplo de 5, mas n�o de 2 e nem de 10.")
      senao
         se numero%2=0 entao
            Escreval ("Esse n�mero � m�ltiplo de 2, mas n�o de 5 e nem de 10.")
         senao
            Escreval ("Esse n�mero n�o � m�ltiplo de 10, nem de 5 e nem de 2.")
         fimse
      fimse
   fimse
Fimalgoritmo