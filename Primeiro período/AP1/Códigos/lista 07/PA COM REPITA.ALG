Algoritmo "PA com repita"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Mostra os termos de uma pa de tamanho determinado pelo usuário
// Autor(a) : Jaisla Ataídes
// Data atual : 15/12/2021

Var
   an,a1,r,n,auxiliar:inteiro

Inicio
   auxiliar<-1
   escreva("Insira quantos termos da progressão aritmética deseja descobrir:")
   leia (n)
   escreva("Qual é o primeiro termo dessa progressão?")
   leia(a1)
   escreva("Agora, informe a razão:")
   leia(r)
   escreval(" ")
   escreval(" ")
   repita
      an<-a1+(auxiliar-1)*r
      escreva(an," ")
      auxiliar<-auxiliar+1
   ate (auxiliar>n)
Fimalgoritmo
