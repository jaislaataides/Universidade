//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Crie uma função int primo (int num) que verifica se o valor 
// num (positivo) que é passado por valor é primo, se for primo retorne 1 e caso contrário, retorne 0.

#include <stdio.h>
#include "lib04.h"

void main(){
    int input;

    do{
        printf("Insira um numero positivo para saber se ele e' primo: ");
        scanf("%d",&input);
    }while(input<=1);

    printf("\nRetornara 1 se for primo e 0 se nao for: \n   %d",primo(input));
}