Algoritmo "Exerc�cio 5 - raiz,antecessor e sucessor"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula a raiz quadrada, sucessor e antecessor de um n�mero inteiro e positivo
// Autor(a) : Jaisla Ata�des
// Data atual : 08/11/2021

Var
   a,sucessor,antecessor:inteiro
   raiz: real

Inicio

   Escreval ("Insira um valor n�o negativo: ")
   Leia (a) //entrada de dados
   Se (a<0) entao //verifica se � negtivo
      Escreval ("Valor negativo") //sa�da de dados se a condi��o for verdadeira
   senao
      raiz<-RaizQ(a) //raiz quadrada
      sucessor<-a+1 //sucessor
      antecessor<-a-1 //antecessor
      Escreval ("A raiz quadrada do n�mero �: ",raiz)
      Escreval ("O sucessor desse n�mero �: ",sucessor) //sa�das de dados se a condi��o for falsa
      Escreval ("O antecessor desse n�mero �: ",antecessor)
   fimse

Fimalgoritmo