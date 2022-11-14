//      ENUNCIADO:

// A função de Ackermann é definida recursivamente nos números não negativos como segue:
// A(m.n) = n + 1, se m = 0
// A(m.n) = A(m − 1, 1), se m > 0 e n = 0
// A(m.n) = A(m − 1, A(m, n − 1)), se m > 0 e n > 0
// Faça um programa recursivo para calcular a função Ackerman.

#include <stdio.h>

int Ackerman(int m, int n)
{
    if(m == 0 && n > 0)
    {
        return (n+1);
    }
    else if(n == 0 && m > 0)
    {
        return Ackerman(m-1, 1);

    }
    else if(m < 0 || n < 0)
    {
        return 0;
    }
    else
    {
        return (Ackerman(m-1, Ackerman(m, n-1)));
    }
    
} 

void main()
{
    int m,n;
    
    pergunta: 
    printf("Escreva os dois parametros para a funcao Ackermann: \n");
    scanf("%d",&m);
    scanf("%d",&n);

    printf("\nResultado: %d\n\n", Ackerman(m,n));
    system("pause");
    system("cls");

    printf("Deseja calcular a funcao mais uma vez? Digite 1 para sim: ");
    scanf("%d",&m);

    if(m == 1)
    {
        goto pergunta;
    }

}