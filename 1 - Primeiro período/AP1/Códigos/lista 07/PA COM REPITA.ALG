Algoritmo "PA com repita"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Mostra os termos de uma pa de tamanho determinado pelo usu�rio
// Autor(a) : Jaisla Ata�des
// Data atual : 15/12/2021

Var
   an,a1,r,n,auxiliar:inteiro

Inicio
   auxiliar<-1
   escreva("Insira quantos termos da progress�o aritm�tica deseja descobrir:")
   leia (n)
   escreva("Qual � o primeiro termo dessa progress�o?")
   leia(a1)
   escreva("Agora, informe a raz�o:")
   leia(r)
   escreval(" ")
   escreval(" ")
   repita
      an<-a1+(auxiliar-1)*r
      escreva(an," ")
      auxiliar<-auxiliar+1
   ate (auxiliar>n)
Fimalgoritmo
