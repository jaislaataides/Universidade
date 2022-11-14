//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Faça uma função que receba dois números a e b, em seguida, 
// decremente o primeiro e incremente o segundo. Os valores a e b devem ser passados por referência

#include <stdio.h>
#include "lib03.h"

void main(){
    int numero1, numero2;

    printf("Digite o 1* numero: ");
    scanf("%d",&numero1);
    printf("\nDigite o 2* numero: ");
    scanf("%d",&numero2);

    increase(&numero1, &numero2);
    printf("\n\nNumero decrementado: %d \nNumero incrementado: %d", numero1, numero2);
}