Algoritmo "classificação de animais"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : descobre qual animal foi escolhido por meio de perguntas
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   animal, ok, resposta:caractere //variável que irá armazenar o nome do animal, dar prosseguimento ao
   //algoritmo e representar a entrada de dados
   
Inicio
   escreval("Escolha um dos animais a seguir: ")
   escreval(" ")
   escreval("Águia")
   escreval("Avestruz")
   escreval("Cavalo")
   escreval("Cobra")
   escreval("Crocodilo")
   escreval("Homem")
   escreval("Leão")
   escreval("Macaco")
   escreval("Morcego")
   escreval("Pato")
   escreval("Pinguim")
   escreval("Tartaruga")
   escrevaL("")
   escreva("Aperte enter para continuar")
   leia(ok)
   limpatela
   escreval("Digite s para sim e n para não para as perguntas.")
   escreval(" ")
   escreval("É mamífero?")
   leia (resposta)
   se (resposta="s") ou (resposta="S") entao
      escreval(" ")
      escreval("Voa?")
      leia (resposta)
      se (resposta="s") ou (resposta="S") entao
         animal<-"morcego"
      senao
         escreval(" ")
         escreval("É aquático?")
         leia(resposta)
         se(resposta="s") ou (resposta="S") entao
            animal<-"baleia"
         senao
            escreval(" ")
            escreval("É quadrúpede?")
            leia(resposta)
            se (resposta="s") ou (resposta="S") entao
               escreval(" ")
               escreval("É herbívoro?")
               leia (resposta)
               se (resposta="s") ou (resposta="S") entao
                  animal<-"cavalo"
               senao
                  animal<-"leão"
               fimse
            senao
               escreval(" ")
               escreval("É frutífero?")
               leia(resposta)
               se (resposta="s") ou (resposta="S") entao
                  animal<-"macaco"
               senao
                  animal<-"homem"
               fimse
            fimse
         fimse
      fimse
   senao
      escreval(" ")
      escreval("É uma ave?")
      leia(resposta)
      se (resposta="s") ou (resposta="S") entao
         escreval(" ")
         escreval("Consegue nadar e voar?")
         leia (resposta)
         se (resposta="s") ou (resposta="S") entao
            animal<-"pato"
         senao
            escreval(" ")
            escreval("Consegue voar?")
            leia(resposta)
            se (resposta="s") ou (resposta="S") entao
               animal<-"águia"
            senao
               escreval(" ")
               escreval("É um animal tropical?")
               leia (resposta)
               se (resposta="s") ou (resposta="S") entao
                  animal<-"avestruz"
               senao
                  animal<-"pinguim"
               fimse
            fimse
         fimse
      senao
         escreval(" ")
         escreval("O animal tem patas?")
         leia(resposta)
         se (resposta="n") ou (resposta="N") entao
            animal<-"cobra"
         senao
            escreval(" ")
            escreval("É carnívoro?")
            leia(resposta)
            se (resposta="s") ou (resposta="S") entao
               animal<-"crocodilo"
            senao
               animal<-"tartaruga"
            fimse
         fimse
      fimse
   fimse
   limpatela
   escreval(" ")
   escreval("Então, o animal escolhido foi: ",animal,".")
   
Fimalgoritmo