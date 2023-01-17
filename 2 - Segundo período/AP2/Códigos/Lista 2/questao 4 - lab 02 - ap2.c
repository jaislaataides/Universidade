//      ENUNCIADO:

// Faça um programa que leia uma string e conte quantas vogais a, existem na mensagem. 
// Ao final, apresenta o total de vogais a.


#include <stdio.h>

void main ()
{
    char string[30];
    int quantidadedeas = 0,  escolha;

    pergunta:
    system("cls");
    fflush(stdin);
    printf("escreva algo:\n");
    fgets(string, 30, stdin);

    for (int i = 0; string[i] != '\n'; i++)
    {
        if (string[i]=='a' || string[i]=='A')
        {
            quantidadedeas++;
        }
    }

    printf("\nA palavra digitada tem %i letra(s) a\n\n", quantidadedeas);

    printf ("Deseja consultar outro fatorial?\nDigite 1 para sim: ");
    scanf("%d", &escolha);
    
    if (escolha == 1)
    {
        goto pergunta;
    }
}