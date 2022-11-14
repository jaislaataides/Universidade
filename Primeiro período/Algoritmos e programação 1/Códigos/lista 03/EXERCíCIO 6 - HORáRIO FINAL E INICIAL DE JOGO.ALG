- Algoritmo "Exercício 6 - horário final e inicial de jogo"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Calcula a duração de um jogo a partir de horário final e horário inicial
// Autor(a) : Jaisla Ataídes
// Data atual : 09/11/2021

Var
   h0,hf,duracao:inteiro
   dia:caractere
Inicio

   Escreval ("Insira a hora de início do jogo: ")
   Leia (h0)
   Se (h0<0) ou (h0>23) entao //entrada de dado 1
      Escreval (" ")
      Escreval ("Horário inválido.") //mensagem para entrada de dados inválidos
   Senao
      Escreval ("Insrira a hora do fim do jogo: ")
      Leia (hf) //entrada de dado 2
      Se (hf<0) ou (hf>24) entao //verifica se os horários iinseridos não são negativos
         Escreval (" ")
         Escreval ("Horário inválido.") //mensagem para entrada de dados inválidos
      Senao
         Se hf>h0 entao //verifica qual valor inserido é maior para realizar a operação
            correspondente
            duracao<-hf-h0 //operação realizada se o horário final for maior que o horário inicial
            Escreval (" ")
            Escreval ("Os horários inseridos são relativos ao mesmo dia?")
            Escreval ("(Digite s para sim e n para não)")
            Leia (dia)
            Se (dia="n") ou (dia="N") entao //verifica se a diferença dos horários não pode ser superior a 24h
               duracao<-25 //atribui valor maior que 24 horas
            fimse
         senao
            se hf=h0 entao //verifica se o jogo teve a duração de 24 horas (em uma operação onde
               ambos os valores fossem iguais o resultado seria 0)
               duracao<-24 //atribuição do valor 24 quando a condição for verdadeira
               Escreval (" ")
               Escreval ("Os horários inseridos são relativos ao mesmo dia?")
               Escreval ("(Digite s para sim e n para não)")
               Leia (dia)
               Se (dia="s") ou (dia="S") entao //verifica se a diferença entre os horários não é inferior a uma hora
                  duracao<-0 //atribui valor menor que 1 hora
               fimse
            senao
               se hf<h0 entao //verifica se o valor final é matematicamente menor que o valor inicial
                  duracao<-hf-h0+24 //operação realizada para tornar o valor da duração positivo e corrigi-lo
                  Escreval (" ")
                  Escreval ("Os horários inseridos são de dias consecutivos?")
                  Escreval ("(Digite s para sim e n para não)")
                  Leia (dia)
                  Se (dia="n") ou (dia="N") entao //verifica se a diferença dos horários é superior a 24 horas (para
                     hf>h0)
                     duracao<-25 //atribui valor maior que 24 horas
                  fimse
               fimse
            fimse
         fimse
         Se (duracao<1) entao //verifica se a duração é inferior a 1 hora
            Escreval (" ")
            Escreval ("Tempo de jogo não alcança a duração mínima de 1 hora.") //mensagem exibida se a condição
            for satisfeita
         Senao
            Se (duracao>24) entao //verifica se a duração é superior a 24 horas
               Escreval (" ")
               Escreval ("Tempo de jogo ultrapassa o limite de 24 horas.")//mensagem exibida se a condição for satisfeita
            Senao
               Escreval (" ")
               Escreval ("O jogo teve a duração de ",duracao," hora(s).") //saída de dado
            fimse
         fimse
      fimse
   fimse
Fimalgoritmo