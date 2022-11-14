//      ENUNCIADO:

// Escreva um módulo que receba as 3 notas de um aluno por variável global e o tipo de média, variável local. 
// Caso o usuário digite: ‘A’, o procedimento calcula a média aritmética das notas do aluno, se for ‘P’, a sua média 
// ponderada (pesos: 5, 3 e 2). 

float nota1, nota2, nota3;
#include <stdio.h>
#include "calculadorMedia.h"

int main()
{
    char tipodemedia; 

    printf("Escreva a primeira nota: ");
    scanf("%f",&nota1);

    printf("\nEscreva a segunda nota: ");
    scanf("%f",&nota2);

    printf("\nEscreva a terceira nota: ");
    scanf("%f",&nota3);

    fflush(stdin);
    printf("\nDigite o tipo de media que deseja realizar: \n('A' para media aritmetica |'P' para media ponderada)\n");
    scanf("%c", &tipodemedia);

    if(tipodemedia=='A' || tipodemedia=='a')
    {
        mediaAritmetica();
    }else if(tipodemedia=='P' || tipodemedia=='p')
    {
        mediaPonderada();
    }

    return 0;
}