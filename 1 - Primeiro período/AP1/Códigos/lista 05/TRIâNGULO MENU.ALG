Algoritmo "triângulo menu"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : lê os lados de um possivel triângulo e o menu determina se ele pode existir ou o tipo de triângulo
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   a,b,c:inteiro //variáveis para lados do triângulo
   classe,option:caractere //variáveis para classificação e para escolha caso
   cond:logico //variável para verificação
   
Inicio

   escreval("Insira três valores de comprimento.")
   leia (a,b,c) //entrada de dados
   escreval(" ")
   escreval("Qual informação deseja acessar?")
   escreval("Digite 1 para verificar se é possível formar um triângulo.")
   escreval("Digite 2 para saber se o triângulo é equilátero, isósceles ou escaleno.")
   leia (option) //entrada de dado escolha caso
   escolha (option)
   caso "1"
      se (a>abs(b-c)) e (a<(b+c)) entao //condicionais aninhadas que verificam se pode haver triângulo
         cond<-verdadeiro //atribuição de verdade se uma das condições for satisfeita
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
         escreval ("É possível formar um triângulo")
      senao
         Escreval("Não é possível formar um triângulo.")
      fimse
   caso "2"
      escreval(" ")
      se (a>abs(b-c)) e (a<(b+c)) entao //primeiro verifica se pode haver triângulo
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
      se (cond=falso)entao //se não houver triângulonpossível, o programa será encerrado
         escreval("Não pode existir triângulo com essas medidas.")
      senao
         se (a=b) e (b=c) entao //condicionais que determinam o tipo de triângulo
            classe<-"equilátero" //classe recebe o nome que será exibido na mensagem final
         senao
            se (a=b) ou (b=c) ou (a=c) entao
               se (b<>c) ou (a<>b) entao
                  classe<-"isósceles"
               fimse
            senao
               classe<-"escaleno"
            fimse
         fimse
         escreval("O triângulo formado é do tipo ",classe," .")
      fimse
   fimescolha
   
Fimalgoritmo