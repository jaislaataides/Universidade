Algoritmo "vetor resultante 1"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Obt�m vetor resultante de dois vetores
// Autor(a) : Jaisla Ata�des
// Data atual : 24/01/2022

Var
   v1,v2,v3: vetor [1..4] de inteiro
   contador:inteiro

Inicio

   para contador de 1 ate 4 faca
      escreval("Insira um valor para o VETOR 1 {posi��o",contador,"/4}")
      leia (v1[contador])
      limpatela
   fimpara
   para contador de 1 ate 4 faca
      escreval("Insira um valor para o VETOR 2 {posi��o",contador,"/4}")
      leia (v2[contador])
      limpatela
   fimpara
   para contador de 1 ate 4 faca
      v3[contador]<-v1[contador]*v2[contador]
      escreval("A posi��o ",contador," do vetor resultante � ocupada pelo n�mero",v3[contador],".")
      escreval("")
   fimpara

Fimalgoritmo
