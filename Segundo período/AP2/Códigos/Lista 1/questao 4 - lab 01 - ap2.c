//  ENUNCIADO:

//Usando o do while, faça um programa que calcule o fatorial de um número inteiro positivo. 

#include <stdio.h>

void main()
{
    int numero, auxiliar=1, fatorial, escolha;

    pergunta: 
    system ("cls");
    printf ("Escreva o numero cujo fatorial deseja saber\n");
    scanf ("%i", &numero);

    if (numero==0)
    {
        fatorial = 1;
    }else
    {
        fatorial = numero;
    }

    do
    {
        fatorial = fatorial * auxiliar;
        auxiliar++;
    }while (auxiliar < numero);

    printf ("\n\nO fatorial do numero %d e' %d.",numero,fatorial);
    system ("cls");
    printf ("Deseja consultar outro fatorial?\nDigite 1 para sim: ");
    scanf("%d", &escolha);
    
    if (escolha == 1)
    {
        goto pergunta;
    }
}