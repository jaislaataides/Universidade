Algoritmo "relat�rio pre�o produto"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Gera relat�rio de controle a partir de dados em vetor
// Autor(a) : Jaisla
// Data atual : 25/01/2022

Var
   preco,valorfinal: vetor [1..6] de real
   quantidade: vetor [1..6] de inteiro
   contador,posicao,maior:inteiro
   TOTAL,comissao,precomaior: real

Inicio

   para contador de 1 ate 6 faca //preenchimento dos dois vetores (pre�o e qtde)
      escreval("Insira o pre�o do produto ",contador,":")
      escreva("R$ ")
      leia (preco[contador])
      escreval("")
      escreval("")
      escreval("Insira a quantidade do produto ",contador,":")
      leia (quantidade[contador])
      limpatela
   fimpara
   para contador de 1 ate 6 faca //obt�m o valor final de cada item e total
      valorfinal[contador]<-preco[contador]*quantidade[contador]
      total<-total+valorfinal[contador]
   fimpara
   comissao<-total*0.05
   para contador de 1 ate 6 faca
      se maior<quantidade[contador] entao
         maior<- quantidade[contador]
         posicao<-contador
         precomaior<-preco[contador]
      fimse
   fimpara
   escreval(" -------------------------------------------------------------- ")
   escreval("| | RELAT�RIO | |")
   escreval("| |")
   escreval("| PRODUTO N� QTDE PRE�O (und) VALOR FINAL |")
   para contador de 1 ate 6 faca
      escreval("| ",contador," ",quantidade[contador]:6," R$",preco[contador]:10:2,"
      R$",valorfinal[contador]:10:2," |")
   fimpara
   escreval("| |")
   escreval("| TOTAL |")
   escreval("| R$",total:11:2," |")
   escreval(" -------------------------------------------------------------- ")
   |")
   timer (10000)
   timer 0
   limpatela
   escreval("A comiss�o recebida pelo funcion�rio ser� de RS",comissao:1:2," sem incluir seu
   sal�rio base.")
   timer (8000)
   timer 0
   limpatela
   escreval("O item mais comprado est� armazenado na posi��o ",posicao,".")
   escreval("Esse item custa R$",precomaior:1:2,".")

Fimalgoritmo
