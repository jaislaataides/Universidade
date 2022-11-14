Algoritmo "aprovado ou reprovado"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Identifica se o aluno foi aprovado ou não com base nos parâmetros.
// Autor(a) : Jaisla Ataídes
// Data atual : 23/11/2021

Var
   media,nota1,nota2,nota3,presenca:real
   faltas:inteiro

Inicio

   escreval ("Insira a nota obtida na primeira prova: ")
   leia (nota1) //entrada de dados1
   limpatela()
   se (nota1>10) ou (nota1<0) entao
      escreval ("Insira uma nota válida.") //verifica se a nota pode ser admitida (0 a 10)
      leia (nota1) //entrada de dados1 caso a primeira tentativa esteja fora dos parâmetros
      limpatela()
   fimse
   escreval ("Agora insira a nota obtida na segunda prova: ")
   leia(nota2) //entrada de dados2
   limpatela()
   se (nota2>10) ou (nota2<0) entao //verifica se a nota pode ser admitida (0 a 10)
      escreval ("Insira uma nota válida.")
      leia (nota2) //entrada de dados2 se a primeira tentativa não for váilda
      limpatela()
   fimse
   escreval ("Por fim, insira a nota alcançada na terceira prova: ")
   leia (nota3) //entrada de dados3
   limpatela()
   se (nota3>10) ou (nota3<0) entao //verifica se a nota pode ser admitida (0 a 10)
      escreval ("Insira uma nota válida.")
      leia (nota3) //entrada de dados3 se a primeira tentativa não for váilda
      limpatela()
   fimse
   media<-(nota1+nota2+nota3)/3 //calcula a média aritmética simples
   escreval ("Insira a quantidade de faltas")
   leia(faltas) //entrada de dados4
   limpatela()
   se (faltas<0) entao //verifica se a quantidade de faltas pode ser admitida (não negativa)
      escreval ("Insira um número não negativo")
      leia (faltas) //entrada de dados4 se a primeira tentativa não for válida
      limpatela()
   senao
      presenca<-(64-faltas)*25/16 //calcula o percentual de presença
      se (media>=6) e (presenca>75) entao //verifica se o aluno foi aprovado ou não
         escreva("Aluno aprovado, com média ", media:1:2," e frequência ",presenca:1:2,"%. ")
         //mensagem mostrada se o aluno for aprovado
      senao
         escreva("Aluno reprovado, com média ",media:1:2," e frequência ",presenca:1:2,"%.")
         //mensagem mostrada se o aluno for reprovado
      fimse
   fimse

Fimalgoritmo