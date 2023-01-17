//     ENUNCIADO:

// Faça um programa recursivo que leia uma frase e verifique se é um palíndromo. Dica: Considere 
// apenas as consoantes e vogais.

#include <stdio.h>
#include <string.h>

//descrição: a função utiliza recursividade para gerar um resultado inteiro, a partir da análise por pares de
//caractere, simulando booleano, tal que, caso um caractere seja diferente do seu "oposto", o retorno será 0.
int Palindromo(char *frase, char *inverso, int tam)
{
    int x = 1;
    
    if(frase[tam] != inverso[tam])
    {
        x = 0;
    }
    if(tam == 0)
    {
        return x;
    }
    return x*Palindromo(frase, inverso, tam-1);
} 

void main()
{
    char input[80], frase[80];
    int tamanho, espacos;

    printf("Escreva a frase para analisar se e' um palindromo: ");
    scanf("%[^\n]",input);

    tamanho = strlen(input);

    //loop para retirar espaços
    for(int i = 0; i < tamanho; i++)
    {
        if(input[i]==' ')
        {
            for(int j = i + 1; j < tamanho; j++)
            {
                input[j-1] = input[j];
            }
            tamanho--;
        }
    }

    input[tamanho] = '\0';

    strcpy(frase, input);
    strcpy(input, strrev(input));

    if(Palindromo(input, frase, tamanho) == 0)
    {
        printf("\nA frase nao e' um palindromo!");
    }
    else
    {
        printf("\nA frase e' um palindromo!");
    }
}