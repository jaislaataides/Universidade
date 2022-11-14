//      ENUNCIADO:

// Declare duas strings com capacidade para 20 caracteres. Usando a instrução scanf leia a 
// primeira string. Em seguida, copie o texto da primeira variável string para a segunda. Imprima 
// no final o conteúdo das duas strings


#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

void main()
{
    char nome1[20], nome2[20];
    int tamanho;

    printf("Escreva a palavra de 20 caracteres\n\n");
    gets(nome1);
    strcpy(nome2,nome1);
    printf("\nA palavra digitada e :%s",nome2);
}