//      ENUNCIADO:

//Usando o comando typedef, crie um “apelido” para a estrutura criadas no exercício 1

#include <stdio.h>

void main()
{
    struct dados
    {
        char nome[50], endereco[50];
        int idade;
    }usuario;
    
        typedef struct dados x;
    
    printf("Digite o nome do aluno:\n");
    gets(usuario.nome);

    printf("\nQual a idade de %s?\n",usuario.nome);
    scanf("%d",&usuario.idade);

    fflush(stdin);

    printf("\nQual o endereco de %s ?\n",usuario.nome);
    gets(usuario.endereco);

    system("cls");

    printf("Nome:   \t   %s",usuario.nome);
    printf("\nIdade:   \t  %d anos",usuario.idade);
    printf("\nEndereco: \t    %s\n",usuario.endereco);
}