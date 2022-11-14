//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Faça uma função que receba três valores inteiros por referência 
// e faça a ordenação crescente deles. 

#include <stdio.h>
#include "lib02.h"

void main(){
    int numero1, numero2, numero3;

        printf("Digite o 1* numero: ");
        scanf("%d", &numero1);
        printf("\nDigite o 2* numero: ");
        scanf("%d", &numero2);
        printf("\nDigite o 3* numero: ");
        scanf("%d", &numero3);

    ordenador(&numero1, &numero2, &numero3);
    printf("\nMenor: %d \nIntermediario: %d \nMaior: %d", numero1, numero2, numero3);
}