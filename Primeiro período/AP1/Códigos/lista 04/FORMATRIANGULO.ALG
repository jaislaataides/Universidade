Algoritmo "forma triângulo?"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : Identifica se três valores de comprimento poderiam formar um triângulo.
// Autor(a) : Jaisla Ataídes
// Data atual : 22/11/2021
Var
   a,b,c,maior,sub: inteiro
   cond:logico
   
Inicio

   cond<-falso  //iniciando a variável lógica com valor falso
   Escreval ("Insira o comprimento dos lados: ")
   Leia (a, b, c)  //entrada de dados: comprimento dos lados
   se (a<0) ou (B<0) ou (C<0) entao  //verifica se os comprimentos inseridos são válidos.
      Escreva (“Insira valores de COMPRIMENTO: (não negativos).”)
      Leia (a, b, c)  //entrada de dados: comprimento dos lados
      se (a>b) e (a>c) entao //verifica se o lado a é maior que os demais
         maior<-a  //atribui valor de "a" a maior se a condição for satisfeita
         sub<-b-c
         se (sub<0) entao
            sub<sub*(-1)  //realiza o módulo da subtração entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<b+c) entao //verifica se as medidas satisfazem as leis de formação
            cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condição for satisfeita
         fimse
      fimse
      se (b>a) e (b>c) entao  //verifica se o lado b é maior que os demais
         maior<-b  //atribui valor de "b" a maior se a condição for satisfeita
         sub<-a-c
         se (sub<0) entao
            sub<sub*(-1)  //realiza o módulo da subtração entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<a+c) entao //verifica se as medidas satisfazem as leis de formação
            cond<-verdadeiro //atribui "verdadeiro" a "cond" se a condição for satisfeita
         fimse
      fimse
      se (c>b) e (c>a) entao  //verifica se o lado c é maior que os demais
         maior<-c  //atribui valor de "c" a maior se a condição for satisfeita
         sub<-a-b
         se (sub<0) entao
            sub<-sub*(-1)  //realiza o módulo da subtração entre os dois lados restantes
         fimse
         se (maior>sub) e (maior<a+b) entao  //verifica se as medidas satisfazem as leis de formação
            cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condição for satisfeita
         fimse
      fimse
      se (a=b) e (b=c) entao  //verifica se os três lados são iguais
         cond<-verdadeiro  //atribui "verdadeiro" a "cond" se a condição for satisfeita
      fimse
      se (cond=verdadeiro) entao
         Escreval ("Essas medidas são capazes de formar um triângulo.")  //mensagem se as devidas condições
         de formação forem satisfeitas
      senao
         Escreval ("Essas medidas não são capazes de formar um triângulo.")  //mensagem se não forem
         satisfeitas
      fimse
      
Fimalgoritmo