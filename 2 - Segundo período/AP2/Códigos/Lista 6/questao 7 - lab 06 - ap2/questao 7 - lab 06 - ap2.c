//      ENUNCIADO

// (Elabore um arquivo com extensão .h) Uma garagem de estacionamento cobra R$2,00 de taxa mínima 
// para estacionar até três horas. A garagem cobra um adicional de R$0,50 por hora ou fração caso sejam 
// excedidas as três horas. A taxa máxima para qualquer período determinado de 24 horas é R$10,00. 
// Admita que nenhum carro fique estacionado por mais de 24 horas. Escreva um programa que calcule e 
// imprima as taxas de estacionamento para três clientes que estacionaram ontem seus carros nessa 
// garagem. Você deve fornecer as horas que cada cliente ficou estacionado. Seu programa deve imprimir 
// os resultados organizados em um formato de tabela e deve calcular e imprimir o total recebido no dia de 
// ontem. O programa deve usar a função calcula-Taxas para determinar o valor a ser cobrado de cada 
// cliente. A saída de seu programa deve ter o seguinte formato: 

// Carro     Horas   Taxas 
//   1        1,5     2,00 
//   2        4,0     2,50 
//   3         24    10,00 
// Total     29,5    14,50

#include <stdio.h>

struct estacionamento{
    float valor, horas;
}clientes[3];

#include "lib07.h"

void main(){
    int i=0;
    float valorTotal=0;

    for (i=0; i<3; i++){
        printf("\nEscreva a quantidade de horas que o carro %d ficou estacionado: ",i+1);
        scanf("%f", &clientes[i].horas);
    }

    printf("\n\nCARRO           HORAS           TAXAS\n");

    for (i=0; i<3; i++){
        printf("\n %d          %f            R$%.2f",i+1,clientes[i].horas,calculaTaxas(i,clientes[i].horas));
        valorTotal+=calculaTaxas(i, clientes[i].horas);
    }

    printf("\n\nTotal recebido no dia:  R$%.2f",valorTotal);
}