//      ENUNCIADO:

//Faça um programa usando o laço while para verificar se um determinado número é primo.

#include <stdio.h>

void main ()
{
    int numero, i=1, divisores=0, escolha;

    pergunta:
    system ("cls");
    printf ("Insira um numero para verificar se ele e primo ou composto:\n");
    scanf ("%i", &numero);

    while (i < numero)
    {
        if (numero % i == 0)
        {
            divisores++;
        }
        i++;
    }

    if (divisores > 2)
    {
        printf ("\nO numero %d nao e primo.",numero);
    }else
    {
        printf ("\nO numero %d e primo.",numero);
    }

    printf ("Deseja consultar outro numero?\nDigite 1 para sim: ");
    scanf("%d", &escolha);
    
    if (escolha == 1)
    {
        goto pergunta;
    }
}