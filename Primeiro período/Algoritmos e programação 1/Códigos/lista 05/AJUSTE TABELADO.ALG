Algoritmo "ajuste tabelado"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : calcula ajuste sobre salário
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   salario:real
   
Inicio

   escreva("Insira o salário antes do reajuste: ")
   leia(salario)
   se (salario<0) entao
      escreval ("Salário inválido.")
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
   escreval("O salário atualizado será ",salario:1:2," reais.")
   
Fimalgoritmo
