//      ENUNCIADO

// Escreva um procedimento chamado ORDENA ( ), que tenha as variáveis globais “A”, “B” e “C”. O 
// procedimento deverá ler, ordenar os seus valores do maior para o menor e imprimir na tela o maior seguido 
// pelo valor intermediário e finalizar com o menor. Caso sejam passados valores repetidos, a ordem deles não 
// importa. 

#include <stdio.h>
#include "ordena.h"

int A, B, C;

void main()
{
    printf("Escreva o primeiro valor: ");
    scanf("%d",&A);

    printf("Escreva o segundo valor: ");
    scanf("%d",&B);

    printf("Escreva o terceiro valor: ");
    scanf("%d",&C);

    Ordena(A,B,C);
}