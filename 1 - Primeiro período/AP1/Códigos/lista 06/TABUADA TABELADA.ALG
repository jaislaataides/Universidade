Algoritmo "tabuada tabelada"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula a tabuada de um n�mero inserido pelo usu�rio
// Autor(a) : Jaisla
// Data atual : 08/12/2021

Var
   fator1, fator2, produto, aux, acumulador : inteiro

Inicio

   acumulador<-2
   escreva("Insira o n�mero cuja tabuada deseja conhecer: ")
   leia (fator1)
   aux<-fator1
   enquanto (fator2>-1) e (fator2<11) faca
      produto<-fator1*fator2
      enquanto (aux>=10) faca //verifica quantas casas o n�mero inserido tem
         aux<-aux\10 acumulador<-acumulador+1
      fimenquanto
      escreval(fator1," * ",fator2:2," = ",produto:acumulador)
      escreval("")
      fator2<-fator2+1
   fimenquanto
   
Fimalgoritmo