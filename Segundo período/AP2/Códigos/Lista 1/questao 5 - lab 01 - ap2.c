//  ENUNCIADO

//Faça um programa que, usando laço for conte de 10 a 3, mostrando na tela, e calcula a soma desses números.

#include <stdio.h>

void main(){
    int soma=0;

    for (int i = 10; i >2; i--)
    {
        printf("\n%d",i);
        soma=soma+i;
    }
    
    printf("\n\nA soma desses numeros e igual a %d",soma);
}