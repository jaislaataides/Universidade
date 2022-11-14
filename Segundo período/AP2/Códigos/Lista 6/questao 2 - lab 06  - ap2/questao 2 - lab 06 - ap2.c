//   ENUNCIADO 

// (Elabore um arquivo com extensão .h) Crie uma função contendo uma sub-rotina que retorne 1 se o 
// número digitado for positivo ou 0 se o número for negativo.

#include <stdio.h>
#include "lib02.h"

void main(){
    int input;

    printf("Escreva um numero inteiro.\n");

    scanf("%d",&input);

    printf("\nO sistema retornara 0 se ele for negativo e 1 se for positivo: \n%d",Retornar(input));
}