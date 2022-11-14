//      ENUNCIADO

// Faça uma função que receba um vetor com três valores inteiros por referência e faça a 
// multiplicação do elemento pela posição do vetor (considere a primeira posição com o valor 1). 

#include <stdio.h>
#include "lib02.h"

void main(){
    int vetor[3];

    for(int i = 0; i < 3; i++){
        printf("\tEscreva o valor %d: ",i+1);
        scanf("%d",&vetor[i]);
        printf("\n");
    }

    Multiplicacdor(vetor);

    printf("\n\tVetor multiplicado:\n");
    for(int i = 0; i < 3; i++){
        printf("\t %d",vetor[i]);
    }
}