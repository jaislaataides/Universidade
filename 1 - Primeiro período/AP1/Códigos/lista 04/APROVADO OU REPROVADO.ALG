Algoritmo "aprovado ou reprovado"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Identifica se o aluno foi aprovado ou n�o com base nos par�metros.
// Autor(a) : Jaisla Ata�des
// Data atual : 23/11/2021

Var
   media,nota1,nota2,nota3,presenca:real
   faltas:inteiro

Inicio

   escreval ("Insira a nota obtida na primeira prova: ")
   leia (nota1) //entrada de dados1
   limpatela()
   se (nota1>10) ou (nota1<0) entao
      escreval ("Insira uma nota v�lida.") //verifica se a nota pode ser admitida (0 a 10)
      leia (nota1) //entrada de dados1 caso a primeira tentativa esteja fora dos par�metros
      limpatela()
   fimse
   escreval ("Agora insira a nota obtida na segunda prova: ")
   leia(nota2) //entrada de dados2
   limpatela()
   se (nota2>10) ou (nota2<0) entao //verifica se a nota pode ser admitida (0 a 10)
      escreval ("Insira uma nota v�lida.")
      leia (nota2) //entrada de dados2 se a primeira tentativa n�o for v�ilda
      limpatela()
   fimse
   escreval ("Por fim, insira a nota alcan�ada na terceira prova: ")
   leia (nota3) //entrada de dados3
   limpatela()
   se (nota3>10) ou (nota3<0) entao //verifica se a nota pode ser admitida (0 a 10)
      escreval ("Insira uma nota v�lida.")
      leia (nota3) //entrada de dados3 se a primeira tentativa n�o for v�ilda
      limpatela()
   fimse
   media<-(nota1+nota2+nota3)/3 //calcula a m�dia aritm�tica simples
   escreval ("Insira a quantidade de faltas")
   leia(faltas) //entrada de dados4
   limpatela()
   se (faltas<0) entao //verifica se a quantidade de faltas pode ser admitida (n�o negativa)
      escreval ("Insira um n�mero n�o negativo")
      leia (faltas) //entrada de dados4 se a primeira tentativa n�o for v�lida
      limpatela()
   senao
      presenca<-(64-faltas)*25/16 //calcula o percentual de presen�a
      se (media>=6) e (presenca>75) entao //verifica se o aluno foi aprovado ou n�o
         escreva("Aluno aprovado, com m�dia ", media:1:2," e frequ�ncia ",presenca:1:2,"%. ")
         //mensagem mostrada se o aluno for aprovado
      senao
         escreva("Aluno reprovado, com m�dia ",media:1:2," e frequ�ncia ",presenca:1:2,"%.")
         //mensagem mostrada se o aluno for reprovado
      fimse
   fimse

Fimalgoritmo