Algoritmo "identificador de ano bissexto"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Determina se um ano � bissexto
// Autor(a) : Jaisla Ata�des
// Data atual : 22/11/2021

Var
   ano:inteiro

Inicio

   Escreval ("Insira um ano ")
   Leia (ano) //entrada de dados
   se ano%4<>0 entao //passo 1 - caso contr�rio
      Escreval (ano, " n�o � um ano bissexto.") //etapa 5
   senao
      se ANO%100<>0 entao //passo 2 - caso contr�rio
         Escreval(ano, " � um ano bissexto.")
      senao
         se ano%400<>0 entao //passo 3 - caso contr�rio
            Escreval (ano, " n�o � um ano bissexto.") //etapa 5
         senao
            Escreval (ano, " � ano bissexto.") //etapa 4
         fimse
      fimse
   fimse
Fimalgoritmo
