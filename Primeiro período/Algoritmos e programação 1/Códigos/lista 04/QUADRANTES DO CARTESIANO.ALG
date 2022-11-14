Algoritmo "Quadrantes do cartesiano"
// Disciplina : Algoritmos e Programação 1
// Professor : Ana Paula Freitas Vilela
// Descrição : identifica se o ponto pertence à origem, eixo das abcissas
//(eixo x), ordenadas (eixo y), 1º, 2º, 3º ou 4º quadrante
// Autor(a) : Jaisla Ataídes
// Data atual : 22/11/2021

Var
   X,Y: real

Inicio

   Escreval ("Insira as coordenadas de um ponto: ")
   Escreva ("(")
   Leia (X) //entrada do dado 1
   Limpatela()
   Escreval ("Insira as coordenadas de um ponto: ")
   Escreva ("( ",X,", ")
   Leia (Y) //entrada do dado 2
   Limpatela()
   Escreval ("Insira as coordenadas de um ponto: ")
   Escreval ("( ",X,", ",Y," )")
   Se (X=0) e (Y=0) entao //identifica se o ponto está na origem
      Escreval ("Esse ponto se localiza na origem.")
   senao
      Se (Y=0) entao //identifica se o ponto está no eixo x
         Escreval ("Esse ponto está localizado no eixo das abcissas (eixo x).")
      senao
         Se (X=0) entao //identifica se o ponto está no eixo y
            Escreval ("Esse ponto está localizado no eixo das ordenadas (eixo y).")
         senao
            Se (X>0) e (Y>0) entao //identifica se o ponto está no 1° quadrante
               Escreval ("O ponto pertence ao primeiro quadrante.")
            senao
               Se (X<0) e (Y>0) entao //identifica se o ponto está no 2° quadrante
                  Escreval ("O ponto pertence ao segundo quadrante.")
               senao
                  Se (X<0) e (Y<0) entao//identifica se o ponto está no 3° quadrante
                     Escreval ("O ponto pertence ao terceiro quadrante.")
                  senao
                     Se (X>0) e (Y<0) entao//identifica se o ponto está no 4° quadrante
                        Escreval ("O ponto pertence ao quarto quadrante.")
                     Fimse
                  Fimse
               Fimse
            Fimse
         fimse
      fimse
   fimse
Fimalgoritmo
