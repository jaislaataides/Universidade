Algoritmo "forma tri�ngulo?"
// Disciplina : Algoritmos e Programa��o 1
// Professor : Ana Paula Freitas Vilela
// Descri��o : Identifica se tr�s valores de comprimento poderiam formar um tri�ngulo.
// Autor(a) : Jaisla Ata�des
// Data atual : 22/11/2021
Var
   a,b,c,maior,sub: inteiro
   cond:logico
   
Inicio

   cond<-falso  //iniciando a vari�vel l�gica com valor falso
   Escreval ("Insira o comprimento dos lados: ")
   Leia (a, b, c)  //entrada de dados: comprimento dos lados
   se (a<0) ou (B<0) ou (C<0) entao  //verifica se os comprimentos inseridos s�o v�lidos.
      Escreva (�Insira valores de COMPRIMENTO: (n�o negativos).�)
      Leia (a, b, c)  //entrada de dados: comprimento dos lados
      se (a>b) e (a>c) entao //verifica se o lado a � maior que os demais
         maior<-a  //atribui valor de "a" a maior se a condi��o for satisfeita
         sub<-b-c
         se (sub<0) entao
            sub<sub*(-1)  //realiza o m�dulo da subtra��o entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<b+c) entao //verifica se as medidas satisfazem as leis de forma��o
            cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condi��o for satisfeita
         fimse
      fimse
      se (b>a) e (b>c) entao  //verifica se o lado b � maior que os demais
         maior<-b  //atribui valor de "b" a maior se a condi��o for satisfeita
         sub<-a-c
         se (sub<0) entao
            sub<sub*(-1)  //realiza o m�dulo da subtra��o entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<a+c) entao //verifica se as medidas satisfazem as leis de forma��o
            cond<-verdadeiro //atribui "verdadeiro" a "cond" se a condi��o for satisfeita
         fimse
      fimse
      se (c>b) e (c>a) entao  //verifica se o lado c � maior que os demais
         maior<-c  //atribui valor de "c" a maior se a condi��o for satisfeita
         sub<-a-b
         se (sub<0) entao
            sub<-sub*(-1)  //realiza o m�dulo da subtra��o entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<a+b) entao  //verifica se as medidas satisfazem as leis de forma��o
            cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condi��o for satisfeita
         fimse
      fimse
      se (a=b) e (b=c) entao  //verifica se os tr�s lados s�o iguais
         cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condi��o for satisfeita
      fimse
      se (cond=verdadeiro) entao
         Escreval ("Essas medidas s�o capazes de formar um tri�ngulo.")  //mensagem se as devidas condi��es
         de forma��o forem satisfeitas
      senao
         Escreval ("Essas medidas n�o s�o capazes de formar um tri�ngulo.")  //mensagem se n�o forem
         satisfeitas
      fimse
      
Fimalgoritmo