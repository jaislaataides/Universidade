Algoritmo "classifica��o de animais"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : descobre qual animal foi escolhido por meio de perguntas
// Autor(a) : Jaisla
// Data atual : 02/12/2021

Var
   animal, ok, resposta:caractere //vari�vel que ir� armazenar o nome do animal, dar prosseguimento ao
   //algoritmo e representar a entrada de dados
   
Inicio
   escreval("Escolha um dos animais a seguir: ")
   escreval(" ")
   escreval("�guia")
   escreval("Avestruz")
   escreval("Cavalo")
   escreval("Cobra")
   escreval("Crocodilo")
   escreval("Homem")
   escreval("Le�o")
   escreval("Macaco")
   escreval("Morcego")
   escreval("Pato")
   escreval("Pinguim")
   escreval("Tartaruga")
   escrevaL("")
   escreva("Aperte enter para continuar")
   leia(ok)
   limpatela
   escreval("Digite s para sim e n para n�o para as perguntas.")
   escreval(" ")
   escreval("� mam�fero?")
   leia (resposta)
   se (resposta="s") ou (resposta="S") entao
      escreval(" ")
      escreval("Voa?")
      leia (resposta)
      se (resposta="s") ou (resposta="S") entao
         animal<-"morcego"
      senao
         escreval(" ")
         escreval("� aqu�tico?")
         leia(resposta)
         se(resposta="s") ou (resposta="S") entao
            animal<-"baleia"
         senao
            escreval(" ")
            escreval("� quadr�pede?")
            leia(resposta)
            se (resposta="s") ou (resposta="S") entao
               escreval(" ")
               escreval("� herb�voro?")
               leia (resposta)
               se (resposta="s") ou (resposta="S") entao
                  animal<-"cavalo"
               senao
                  animal<-"le�o"
               fimse
            senao
               escreval(" ")
               escreval("� frut�fero?")
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
      escreval("� uma ave?")
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
               animal<-"�guia"
            senao
               escreval(" ")
               escreval("� um animal tropical?")
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
            escreval("� carn�voro?")
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
   escreval("Ent�o, o animal escolhido foi: ",animal,".")
   
Fimalgoritmo