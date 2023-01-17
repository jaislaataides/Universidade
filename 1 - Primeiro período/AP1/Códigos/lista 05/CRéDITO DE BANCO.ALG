Algoritmo "crédito de banco"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : contabiliza crédito através do saldo médio do usuário
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   saldomedio,credito: real
   
Inicio
   escreva("Insira qual foi o saldo médio anual no último ano: ")
   leia(saldomedio)
   se (saldomedio<=200) entao
      credito<-0
   senao
      se (saldomedio<=400) entao
         credito<-saldomedio*1/5
      senao
         se (saldomedio<=600) entao
            credito<-saldomedio*3/10
         senao
            se (saldomedio>600) entao
               credito<-saldomedio*2/5
            fimse
         fimse
      fimse
   fimse
   escreval("O crédito liberado foi de ",credito:1:2," reais.")
   
Fimalgoritmo