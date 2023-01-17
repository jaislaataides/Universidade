//      ENUNCIADO:

// Usando a função recursiva para calcular o fatorial, determine o resultado do fatorial quádruplo, de 
// um número N, que é dado por:
// (2𝑛)! / n!


#include <stdio.h>

float Fatorial(float fat)
{
    if(fat == 1 || fat == 0)
    {
        return 1;
    }
    else if (fat > 1)
    {
        return fat*Fatorial(fat-1);
    }
    else
    {
        return 0;
    }
}

void main()
{
    float n, quadruplo;
    
    pergunta:
    printf("Escreva o numero cujo fatorial quadruplo sera calculado: ");
    scanf("%f",&n);

    quadruplo = Fatorial(n*2)/Fatorial(n);

    printf("\n\nO fatorial quadruplo e' igual a %.2f.\n\n\n",quadruplo);

    system("pause");
    system("cls");

    printf("Deseja fazer esse calculo novamente? Digite 1 para sim: ");
    scanf("%f",&n);

    if(n == 1)
    {
        goto pergunta;
    }
}