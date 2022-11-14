//      ENUNCIADO: 

// Faça um programa que leia uma variável global (n), um valor entre 1 e 9. Usando uma sub-rotina calcule e 
// mostre a seguinte tabela de multiplicação (no exemplo, n = 8). 

// 1
// 2  4
// 3  6  9
// 4  8  12 16
// 5  10 15 20 25
// 6  12 18 24 30 36
// 7  14 21 28 35 42 49
// 8  16 24 32 40 48 56 64


#include <stdio.h>
#include "tabuada.h"

int N=0;

void main()
{
    do
    {
        printf("Escreva um numero entre 1 e 9: ");
        scanf("%d",&N);
    }while(N<1 || N>9);
    
    Tabuada(N);
}
