//    ENUNCIADO:

// Escreva uma função recursiva que calcule o Fibonacci de um determinado número.

#include <stdio.h>

int Fibonacci(int n)
{
    if (n == 1 || n == 2)
    {
        return 1;
    }
    else
    {
        return (Fibonacci(n-1) + Fibonacci(n-2));
    }
}

void main()
{
    int input;

    pergunta:
    printf("Escreva a posicao da sequencia Fibonacci que deseja consultar: ");
    scanf("%d",&input);
    
    printf("\nO %d numero da sequencia e' %d\n\n",input,Fibonacci(input));

    system("pause");
    system("cls");

    printf("Deseja fazer o processo mais uma vez? Digite 1 para sim: ");
    scanf("%d",&input);
    system("cls");

    if(input == 1)
    {
        goto pergunta;  
    }
}