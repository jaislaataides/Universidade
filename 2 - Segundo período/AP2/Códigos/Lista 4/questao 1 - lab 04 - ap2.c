//      ENUNCIADO:

// Declare uma estrutura do tipo cadastro, com os seguintes campos: 
// NOME 
// RUA NÚMERO CPF 
// SALDO 
// a) Declare um vetor do tipo cadastro com 5 posições e faça a carga automática dos valores: 
// b) Ler novos valores para os dados: 
// c) Escrever na tela, os dados lidos no item anterior


#include <stdio.h>

void main()
{
    struct endereco
    {
        char rua[50];
        int numero;
    };
    
    struct fichacliente
    {
        char nome[50], cpf[11];
        float saldo;
        struct endereco end;
    };

    struct fichacliente ficha[]= {{"joao","70875158102",705.75,{"Rua Osório",36}},{"maria","5641586745",2003.03,{"Rua filadelfia",532}},{"jonathan","52348541354",506,{"Rua pindamonhangaba",632}},{"julia","52346353645",3563,{"rua beija flor",3545}},{"beatriz","53485154564", 5634 , {"Rua pinheiro",541}}};
    
    int i;

    for (i=0; i<5; i++)
    {
        printf("---------- FICHA ---------");
        printf("\n     Cliente [%d/5] \n",i+1);

        printf("\nNome: ");
        scanf("%[^\n]",ficha[i].nome);
        fflush(stdin);
        
        printf("\nEndereco => Rua: ");
        scanf("%[^\n]",ficha[i].end.rua);
        
        printf("\nNumero: ");
        scanf("%d",&ficha[i].end.numero);
        fflush(stdin);
        
        printf("\nCPF: ");
        fgets(ficha[i].cpf, 11, stdin);
        fflush(stdin);
        
        printf("\nSaldo do cliente: R$");
        scanf("%f",&ficha[i].saldo);
        fflush(stdin);
        
        system("pause");
        system("cls");
    }
    
    for (i=0; i<5; i++)
    {
        printf("------ FICHA DO CLIENTE ------\n");
        printf("        Cliente [%d/5] \n\n",i+1);
        printf("Nome: %s\n",ficha[i].nome);
        printf("Rua: %s \tNumero: %d \nCPF: %s\n",ficha[i].end.rua,ficha[i].end.numero,ficha[i].cpf);
        printf("Saldo: R$ %.2f \n\n\n\n",ficha[i].saldo);
    }
}