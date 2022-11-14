//      ENUNCIADO:

// Usando o conceito de estrutura dentro de estrutura, crie duas estruturas que permitem manipular os 
// seguintes dados: 
// ( rua    |   numero ) ->  endereço
// ( nome   |   saldo   | endereço ) -> pessoa
// a) Declare e faça a carga automática das variáveis; 
// b) Atualize os valores das variáveis utilizando o comando de atribuição ou strcpy (para o caso de 
// string);
// c) Escreva na tela os valores dos campos do registro



#include <stdio.h>
#include <string.h>

void main()
{
    struct endereco
    {
        char rua[50], CEP[8];
        int numero;
    };

    struct endereco;

    struct cadastro
    {
        char nome[50];
        float saldo;
        struct endereco end;
    }pessoa = {"juliana",1365.23,{"Avenida Júpiter","56415000",32}};

    //auxiliares
    char n[50],r[50],c[50];
    float sald;
    int num;


    printf("Escreva o nome: ");
    gets(n);
    strcpy(pessoa.nome, n);
    
    printf("\nEscreva o endereco.\nRua: ");
    gets(r);
    strcpy(pessoa.end.rua, r);
    
    printf("\nEscreva o CEP: ");
    gets(c);
    strcpy(pessoa.end.CEP, c);
    
    printf("\nEscreva o numero: ");
    scanf("%d",&num);
    pessoa.end.numero=num;
    
    printf("\n\nQual o saldo de %s?\n",n);
    scanf("%f",&sald);
    pessoa.saldo=sald;

    system("cls");
    printf("\t------------ REGISTRO ------------");
    printf("\n\n\tNome: %s\tSaldo: R$%.2f",pessoa.nome,pessoa.saldo);
    printf("\n\n\t\t     ENDERECO");
    printf("\n\tRua: %s",pessoa.end.rua);
    printf("\n\tCEP: %s",pessoa.end.CEP);
    printf("\n\tNumero: %d",pessoa.end.numero);
    printf("\n\n");
}