//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Crie uma função que receba como parâmetro um valor positivo 
// do tipo inteiro N e retorne o valor de S. Notem que para fazer a variável S será do tipo real, recebendo a 
// divisão de dois valores do tipo inteiro. Logo, será necessário fazer a operação de casting, ou seja, 
// s = (float) var1/var2;

// S = 1 + 1/1! + 1/2! + 1/3! ... +1/N!

#include <stdio.h>
#include "lib06.h"

void main(){
    int n;
    
    printf("Escreva um numero inteiro: ");
    scanf("%d", &n);

    printf("A soma dos fatoriais no denominador e' %f", fatorialnodenominador(n));
} 