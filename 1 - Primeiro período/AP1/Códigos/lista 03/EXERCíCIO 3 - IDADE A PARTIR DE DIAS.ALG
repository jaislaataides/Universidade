Algoritmo "Exerc�cio 3 - Idade a partir de dias"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula a quantidade de anos, meses e dias a partir de uma informa��o em dias.
// Autor(a) : Jaisla Ata�des
// Data atual : 08/11/2021

Var
   idade,aa,dd,mm:inteiro

Inicio

   Escreval ("Insira a sua idade em dias")
   Leia (idade) //entrada de dados
   Se (idade<0) entao //identificar se o n�mero de dias � v�lido
      escreval ("N�mero inv�lido!")
   Senao
      aa<-idade\365 //encontra quantos anos
      mm<-(idade-aa*365)\30 //utiliza o resto da divis�o para anos no c�lculo de
      meses
      dd<-idade-(aa*365+mm*30) //mostra a quantidade de dias remanescentes
      Escreva (aa," anos",mm," meses",dd," dias") //sa�da de dados
   fimse
Fimalgoritmo