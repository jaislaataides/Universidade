Algoritmo "tri�ngulo menu"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : l� os lados de um possivel tri�ngulo e o menu determina se ele pode existir ou o tipo de tri�ngulo
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   a,b,c:inteiro //vari�veis para lados do tri�ngulo
   classe,option:caractere //vari�veis para classifica��o e para escolha caso
   cond:logico //vari�vel para verifica��o
   
Inicio

   escreval("Insira tr�s valores de comprimento.")
   leia (a,b,c) //entrada de dados
   escreval(" ")
   escreval("Qual informa��o deseja acessar?")
   escreval("Digite 1 para verificar se � poss�vel formar um tri�ngulo.")
   escreval("Digite 2 para saber se o tri�ngulo � equil�tero, is�sceles ou escaleno.")
   leia (option) //entrada de dado escolha caso
   escolha (option)
   caso "1"
      se (a>abs(b-c)) e (a<(b+c)) entao //condicionais aninhadas que verificam se pode haver tri�ngulo
         cond<-verdadeiro //atribui��o de verdade se uma das condi��es for satisfeita
      senao
         se (b>abs(a-c)) e (b<(a+c)) entao
            cond<-verdadeiro
         senao
            se (c>abs(a-b)) e (c<(a+b)) entao
               cond<-verdadeiro
            fimse
         fimse
      fimse
      escreval(" ")
      se (cond=verdadeiro)entao
         escreval ("� poss�vel formar um tri�ngulo")
      senao
         Escreval("N�o � poss�vel formar um tri�ngulo.")
      fimse
   caso "2"
      escreval(" ")
      se (a>abs(b-c)) e (a<(b+c)) entao //primeiro verifica se pode haver tri�ngulo
         cond<-verdadeiro
      senao
         se (b>abs(a-c)) e (b<(a+c)) entao
            cond<-verdadeiro
         senao
            se (c>abs(a-b)) e (c<(a+b)) entao
               cond<-verdadeiro
            fimse
         fimse
      fimse
      se (cond=falso)entao //se n�o houver tri�ngulonposs�vel, o programa ser� encerrado
         escreval("N�o pode existir tri�ngulo com essas medidas.")
      senao
         se (a=b) e (b=c) entao //condicionais que determinam o tipo de tri�ngulo
            classe<-"equil�tero" //classe recebe o nome que ser� exibido na mensagem final
         senao
            se (a=b) ou (b=c) ou (a=c) entao
               se (b<>c) ou (a<>b) entao
                  classe<-"is�sceles"
               fimse
            senao
               classe<-"escaleno"
            fimse
         fimse
         escreval("O tri�ngulo formado � do tipo ",classe," .")
      fimse
   fimescolha
   
Fimalgoritmo