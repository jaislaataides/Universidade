Algoritmo "identificador de ano bissexto"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Determina se um ano é bissexto
// Autor(a) : Jaisla Ataídes
// Data atual : 22/11/2021

Var
   ano:inteiro

Inicio

   Escreval ("Insira um ano ")
   Leia (ano) //entrada de dados
   se ano%4<>0 entao //passo 1 - caso contrário
      Escreval (ano, " não é um ano bissexto.") //etapa 5
   senao
      se ANO%100<>0 entao //passo 2 - caso contrário
         Escreval(ano, " é um ano bissexto.")
      senao
         se ano%400<>0 entao //passo 3 - caso contrário
            Escreval (ano, " não é um ano bissexto.") //etapa 5
         senao
            Escreval (ano, " é ano bissexto.") //etapa 4
         fimse
      fimse
   fimse
Fimalgoritmo
