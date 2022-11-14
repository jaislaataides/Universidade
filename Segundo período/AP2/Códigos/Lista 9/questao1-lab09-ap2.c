//      ENUNCIADO:

// Implemente a função recursiva e iterativa POT, que devolve o valor x^n.


#include <stdio.h>

double Pot(float x, int n)
{
    if(n==1)
    {
        return x;
    }else
    {
        return x*Pot(x,n-1);
    }
}

void main()
{
    float x;
    int n;

    pergunta:
    printf("Escreva a base da potencia: ");
    scanf("%f",&x);
    printf("\nInsira o expoente: ");
    scanf("%d",&n);
    printf("\n\nA potencia resulta em %.0lf.\n\n\n",Pot(x,n));

    system("pause");
    system("cls");
    printf("Deseja calcular novamente? Digite 1 para sim: ");
    scanf("%d",&n);

    if(n == 1)
    {
        goto pergunta;
    }
}