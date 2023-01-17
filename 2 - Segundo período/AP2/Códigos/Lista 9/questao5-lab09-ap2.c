//  ENUNCIADO:

// Escreva uma função recursiva para calcular a seguinte expressão:
// Somatório de 2*(i-1) de i=1 ate n


#include <stdio.h>

int Somatorio(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else
    {
        return Somatorio(n-1)+(2*(n-1));
    }
}

void main()
{
    int n, i;

    pergunta:
    printf("Escreva o limite para o somatorio: ");
    scanf("%d",&n);

    printf("\nSomatorio: %d",Somatorio(n));

    system("pause");
    system("cls");

    printf("Deseja fazer outro calculo? Digite 1 para sim: ");
    scanf("%d",&n);
    system("cls");

    if(n == 1)
    {
        goto pergunta;
    } 
}