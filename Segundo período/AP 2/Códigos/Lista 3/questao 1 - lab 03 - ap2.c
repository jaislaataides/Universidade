//      ENUNCIADO:

// Implemente um programa que leia o nome, a idade e o endereço de uma pessoa e armazene 
// os dados em uma estrutura.

#include <stdio.h>

void main()
{
    struct dados
    {
        char nome[50], endereco[50];
        int idade;
    }usuario;

    {
        struct dados a,b,c;
        typedef struct dados x;
    }
    
    printf("Digite o nome do aluno:\n");
    gets(usuario.nome);

    printf("\nQual a idade de %s?\n",usuario.nome);
    scanf("%d", &usuario.idade);

    fflush(stdin);

    printf("\nQual o endereco de %s ?\n",usuario.nome);
    gets(usuario.endereco);

    system("cls");

    printf("Nome:   \t   %s",usuario.nome);
    printf("\nIdade:   \t  %d anos",usuario.idade);
    printf("\nEndereco: \t    %s\n",usuario.endereco);
}