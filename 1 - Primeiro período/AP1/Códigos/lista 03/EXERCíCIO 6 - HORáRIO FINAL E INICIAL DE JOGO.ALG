- Algoritmo "Exerc�cio 6 - hor�rio final e inicial de jogo"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Calcula a dura��o de um jogo a partir de hor�rio final e hor�rio inicial
// Autor(a) : Jaisla Ata�des
// Data atual : 09/11/2021

Var
   h0,hf,duracao:inteiro
   dia:caractere
Inicio

   Escreval ("Insira a hora de in�cio do jogo: ")
   Leia (h0)
   Se (h0<0) ou (h0>23) entao //entrada de dado 1
      Escreval (" ")
      Escreval ("Hor�rio inv�lido.") //mensagem para entrada de dados inv�lidos
   Senao
      Escreval ("Insrira a hora do fim do jogo: ")
      Leia (hf) //entrada de dado 2
      Se (hf<0) ou (hf>24) entao //verifica se os hor�rios iinseridos n�o s�o negativos
         Escreval (" ")
         Escreval ("Hor�rio inv�lido.") //mensagem para entrada de dados inv�lidos
      Senao
         Se hf>h0 entao //verifica qual valor inserido � maior para realizar a opera��o
            correspondente
            duracao<-hf-h0 //opera��o realizada se o hor�rio final for maior que o hor�rio inicial
            Escreval (" ")
            Escreval ("Os hor�rios inseridos s�o relativos ao mesmo dia?")
            Escreval ("(Digite s para sim e n para n�o)")
            Leia (dia)
            Se (dia="n") ou (dia="N") entao //verifica se a diferen�a dos hor�rios n�o pode ser superior a 24h
               duracao<-25 //atribui valor maior que 24 horas
            fimse
         senao
            se hf=h0 entao //verifica se o jogo teve a dura��o de 24 horas (em uma opera��o onde
               ambos os valores fossem iguais o resultado seria 0)
               duracao<-24 //atribui��o do valor 24 quando a condi��o for verdadeira
               Escreval (" ")
               Escreval ("Os hor�rios inseridos s�o relativos ao mesmo dia?")
               Escreval ("(Digite s para sim e n para n�o)")
               Leia (dia)
               Se (dia="s") ou (dia="S") entao //verifica se a diferen�a entre os hor�rios n�o � inferior a uma hora
                  duracao<-0 //atribui valor menor que 1 hora
               fimse
            senao
               se hf<h0 entao //verifica se o valor final � matematicamente menor que o valor inicial
                  duracao<-hf-h0+24 //opera��o realizada para tornar o valor da dura��o positivo e corrigi-lo
                  Escreval (" ")
                  Escreval ("Os hor�rios inseridos s�o de dias consecutivos?")
                  Escreval ("(Digite s para sim e n para n�o)")
                  Leia (dia)
                  Se (dia="n") ou (dia="N") entao //verifica se a diferen�a dos hor�rios � superior a 24 horas (para
                     hf>h0)
                     duracao<-25 //atribui valor maior que 24 horas
                  fimse
               fimse
            fimse
         fimse
         Se (duracao<1) entao //verifica se a dura��o � inferior a 1 hora
            Escreval (" ")
            Escreval ("Tempo de jogo n�o alcan�a a dura��o m�nima de 1 hora.") //mensagem exibida se a condi��o
            for satisfeita
         Senao
            Se (duracao>24) entao //verifica se a dura��o � superior a 24 horas
               Escreval (" ")
               Escreval ("Tempo de jogo ultrapassa o limite de 24 horas.")//mensagem exibida se a condi��o for satisfeita
            Senao
               Escreval (" ")
               Escreval ("O jogo teve a dura��o de ",duracao," hora(s).") //sa�da de dado
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo