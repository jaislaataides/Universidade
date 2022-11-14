//      ENUNCIADO: 

// Faça um programa que leia uma string e verifique se ela é palíndromo (sem utilizar funções da biblioteca string.h).
// Um palíndromo acontece quando uma palavra lida de frente para trás é igual à palavra lida de trás  
// para frente. Exemplo: arara, anotaram a data da maratona, missa é assim.

#include <stdio.h>

void main ()
{

    char string[50], aux[50];
    int i, j, tamanho, condicional, resultado=0;
    int quantidadedeespacos=0;

    printf("escreva uma palavra para saber se ela e um palindromo: \n");
    gets(string);

    //calcula o tamanho da string sem usar função
    for (i = 0; string[i] != '\0'; i++)
    {
        tamanho = i;
        aux[i] = string[i];
    }

    //retira espaços
    for (i = 0; i < tamanho+1; i++)
    {
        if (string[i] == ' ')
        {
            for (j = i+1; j < tamanho+1; j++)
            {
                string[j-1] = string[j];
            }
            quantidadedeespacos++;
        }
    }

    //abrevia o final da string levando em consideração os espaços retirados

    string[tamanho+1] = '\0';

    if (tamanho % 2!= 0)
    {
        //executa caso seja uma palavra com número ímpar de caracteres
        condicional = (tamanho+1)/2;
        //separa os últimos caracteres para comparação
        for (i = tamanho, j=0; i > condicional-1; i--, j++)
        {
            if (string[i] != string[j])
            {
                resultado = 1;
                break;
            }
        }
    }else if (tamanho % 2 == 0)
    {
        //executa caso seja uma palavra com número ímpar de caracteres
        condicional = (tamanho / 2)+ 1;
        //separa os últimos caracteres para comparação
        for (i = tamanho, j = 0; i > condicional-1; i--,j++)
        {
            if (string[i] != string[j])
            {
                resultado = 1;
                break;
            }
        }
    }


    if (resultado == 0)
    {
        //é palíndromo
        if (quantidadedeespacos>0)
        {
            printf("\nA frase %s e' um palidromo",aux);
        }else
        {
            printf("\nA palavra %s e' um palidromo",string);
        }
    }else
    {
        //não é palíndromo
        if (quantidadedeespacos>0)
        {
            printf("\nA frase %s nao e' um palindromo.",aux);
        }else
        {
            printf("\nA palavra %s nao e' um palindromo.",string);
        }
    }
}
