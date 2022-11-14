//   ENUNCIADO

// (Elabore um arquivo com extensão .h) Escreva uma função potencialnt (base, expoente) que retorne 
// o valor de base^expoente. Por exemplo, potencialnt (3,4) =3 * 3 * 3 * 3. Admita que expoente é um 
// inteiro positivo, diferente de zero, e base é um inteiro. A função potencialnt deve usar while para 
// controlar o cálculo. Não use nenhuma função da biblioteca matemática

#include <stdio.h>
#include "lib05.h"

void main(){
    int a, b;

    printf("Escreva um numero para a base da potencia: ");
    scanf("%d",&a);

    printf("Escreva um numero para o expoente: ");
    scanf("%d",&b);

    printf("O resultado da potencia e' %d",potencialnt(a, b));
}