Algoritmo "Exercício 5 - raiz,antecessor e sucessor"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula a raiz quadrada, sucessor e antecessor de um número inteiro e positivo
// Autor(a) : Jaisla Ataídes
// Data atual : 08/11/2021

Var
   a,sucessor,antecessor:inteiro
   raiz: real

Inicio

   Escreval ("Insira um valor não negativo: ")
   Leia (a) //entrada de dados
   Se (a<0) entao //verifica se é negtivo
      Escreval ("Valor negativo") //saída de dados se a condição for verdadeira
   senao
      raiz<-RaizQ(a) //raiz quadrada
      sucessor<-a+1 //sucessor
      antecessor<-a-1 //antecessor
      Escreval ("A raiz quadrada do número é: ",raiz)
      Escreval ("O sucessor desse número é: ",sucessor) //saídas de dados se a condição for falsa
      Escreval ("O antecessor desse número é: ",antecessor)
   fimse

Fimalgoritmo