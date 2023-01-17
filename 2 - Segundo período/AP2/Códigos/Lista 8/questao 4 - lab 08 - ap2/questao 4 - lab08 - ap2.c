//      ENUNCIADO

// Faça uma sub-rotina que receba um vetor A de dez elementos inteiros como parâmetros. Ao final 
// dessa função, deverá ter sido gerado um vetor B contendo o fatorial de cada elemento de A. O vetor 
// B deverá ser mostrado no programa principal (ou seja, na função invocadora).

#include <stdio.h>
#include "lib04.h"

void main(){
    int vetorA[10], vetorB[10];
    int i;

    for(i = 0; i < 10; i++){
        printf("\nEscreva o %d* elemento do vetor A: ",i+1);
        scanf("%d",&vetorA[i]);
    } 

    Fatorial(vetorA, vetorB);

    for(i = 0; i < 10; i++){
        printf("\n %d",vetorB[i]);
    }
}