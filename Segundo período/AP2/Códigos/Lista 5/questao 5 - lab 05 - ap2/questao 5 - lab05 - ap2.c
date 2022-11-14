//      ENUNCIADO

// Escreva um programa que leia o número de um funcionário (variável local), seu número de horas trabalhadas 
// (variável global), o valor que recebe por hora (variável global) e, usando sub-rotina calcula o salário desse 
// funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 

struct funcionarios
{
    int horasTrabalhadas;
    float valorPorHora;
}empregado;

#include <stdio.h>
#include "calculadorDeSalario.h"

void main()
{
    char numero[20];

    printf("Insira o numero do funcionario: ");
    scanf("%[^\n]",numero);

    printf("\nInsira a quantidade de horas trabalhadas por %s: ",numero);
    scanf("%d",&empregado.horasTrabalhadas);

    printf("\nInsira o valor recebido por hora: ");
    scanf("%f",&empregado.valorPorHora);

    salarioHorario(numero);
}