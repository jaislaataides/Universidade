//      ENUNCIADO:

// Faça um procedimento que receba uma string de 50 posições e posteriormente, usando 
// switch case, apresente um menu interativo que permita: 
// a) Exiba o tamanho do texto;
// b) Escreve a string de trás para frente.

#include <stdio.h>

void main ()
{
    char nome[50];
    int decisor, tamanho;

    printf("Insira um nome:\n");
    scanf("%s",&nome);

    tamanho = strlen(nome);

    system("cls");

    printf("\t\tVoce deseja: \n '1' - ver o comprimento da palavra \t'2'- ver a palavra ao contrario\n\n");
    scanf("%i",&decisor);

    system("cls");

    while (decisor < 1 || decisor > 2)
    {
        printf("O numero digitado nao e' valido, por favor digite novamente:\n");
        printf("\n'1' - ver o comprimento da palavra \t'2'- ver a palavra ao contrário");
        scanf("%i", &decisor);
        system("cls");
    } 

    switch (decisor)
    {
    case 1:
        printf("\nA palavra inserida tem %i carcateres.",tamanho);
        break;
    
    case 2:
        for(int i = tamanho; i >= 0; i--)
        {
            printf("%c", nome[i]);
        }
        break;
    }
}