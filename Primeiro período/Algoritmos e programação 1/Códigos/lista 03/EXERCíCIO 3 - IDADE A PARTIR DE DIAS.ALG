Algoritmo "Exercício 3 - Idade a partir de dias"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula a quantidade de anos, meses e dias a partir de uma informação em dias.
// Autor(a) : Jaisla Ataídes
// Data atual : 08/11/2021

Var
   idade,aa,dd,mm:inteiro

Inicio

   Escreval ("Insira a sua idade em dias")
   Leia (idade) //entrada de dados
   Se (idade<0) entao //identificar se o número de dias é válido
      escreval ("Número inválido!")
   Senao
      aa<-idade\365 //encontra quantos anos
      mm<-(idade-aa*365)\30 //utiliza o resto da divisão para anos no cálculo de
      meses
      dd<-idade-(aa*365+mm*30) //mostra a quantidade de dias remanescentes
      Escreva (aa," anos",mm," meses",dd," dias") //saída de dados
   fimse
Fimalgoritmo