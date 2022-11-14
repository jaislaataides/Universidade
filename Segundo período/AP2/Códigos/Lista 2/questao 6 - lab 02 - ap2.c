//      ENUNCIADO:

// Faça um programa que leia duas strings e faça a concatenação delas numa terceira string.

#include <stdio.h>

void main ()
{
    char str1[15], str2[15], str3[30];
    int i, j,tamanho1=0, tamanho2=0;

    printf("Escreva uma palavra:\n");
    gets(str1);

    //delimita o tamanho da primeira string
    for(i = 0; str1[i] != '\0'; i++)
    {
        tamanho1 = i;
    }

    //armazena-a na terceira
    for (i = 0; i < tamanho1+1; i++)
    {
        str3[i] = str1[i];
    }

    printf("\nAgora, escreva outra palavra:\n");
    gets(str2);

    //delimita o tamanho da segunda
    for(i = 0; str2[i] != '\0'; i++)
    {
        tamanho2 = i;
    }

    //armazena a segunda string na terceira
    for(i = tamanho1+1, j = 0; str2[j] != '\0'; i++, j++)
    {
        str3[i] = str2[j];
        //determina o fim da string 3
        if(i == (tamanho1+tamanho2+1))
        {
            str3[i+1] = '\0';
        }
    }
    printf("\nVeja em seguida a string concatenada: \t%s",str3);
}