Algoritmo "ajuste tabelado"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : calcula ajuste sobre sal�rio
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   salario:real
   
Inicio

   escreva("Insira o sal�rio antes do reajuste: ")
   leia(salario)
   se (salario<0) entao
      escreval ("Sal�rio inv�lido.")
   senao
      se (salario<7000) entao
         salario<- salario+salario/10
      senao
         se (salario=7000) ou (salario<8000) entao
            salario<- salario+salario*8/100
         senao
            se (salario=8000) ou (salario<10000) entao
               salario<- salario + salario*6/100
            senao
               salario<-salario + salario*4/100
            fimse
         fimse
      fimse
   fimse
   escreval("O sal�rio atualizado ser� ",salario:1:2," reais.")
   
Fimalgoritmo
