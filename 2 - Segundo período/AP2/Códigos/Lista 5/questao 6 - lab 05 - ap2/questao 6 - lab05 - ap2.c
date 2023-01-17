//      ENUNCIADO

// Uma empresa do ramo de material esportivo deseja ter um controle automatizado dos funcionários que 
// trabalham em cada uma das suas filiais. Sabe-se que essa empresa possui ao todo 4 empresas com 1 
// vendedor e 1 gerente em cada uma delas. Todos devem ser cadastrados como funcionários. Faça um 
// programa que realize esse controle, criando as variáveis do tipo struct filial e struct funcionario de escopo 
// global, e que contenha as seguintes rotinas: 

//   FILIAL        ||     FUNCIONARIO
// num_filial      ||     num_filial
// nome_filial     ||     codigo_funcionario
//                 ||     nome_funcionario
//                 ||     cargo
//                 ||     salario

// a) Cadastrar empresa, observando que não podem existir duas empresas com o mesmo número. 
// b) Cadastrar funcionário, observando que cada funcionário deve estar alocado numa filial existente. 
// c) Criar uma consulta a todas as filiais, mostrando o nome do gerente e do vendedor, o valor total gasto no 
// pagamento de salários por filial e o valor gasto com pagamento do salário geral. 

#include <stdio.h>
#include <string.h>

struct funcionario
{
    int numeroFilial, codigoFuncionario;
    char nomeFuncionario[50], cargo[50];
    float salario;
};

struct filial
{
    int numeroFilial;
    char nomeFilial[50];
    struct funcionario func[2];
}und[4];

    int decisao=0, decisor=0;

#include "CadastrosEBusca.h"

void menu()
{
    printf("O que voce gostaria de fazer agora?\n");
    printf("1- cadastrar empresas\n");
    printf("2- cadastrar funcionarios\n");
    printf("3- consultar despesas.\n");
    scanf("%d", &decisao);
    limpar();
}

void main(){
    menuprincipal:
    menu();

    while(decisao < 1 || decisao > 3){
        printf("\n\n+O numero inserido nao corresponde a nenhuma opcao.\n");
        menu();
    }

    fflush(stdin);
    system("cls");

    switch (decisao)
    {
    case 1:
        CadastrarEmpresa();
        printf("--- Deseja voltar ao menu principal? ---\n(Pressione 1 para sim e 0 para nao)\n");
        scanf("%d", &decisor);
        if (decisor == 1){
            system("cls");
            goto menuprincipal;
        }
        break;
    
    case 2:
        decisor=0;
        cadastrarFuncionario();
        printf("--- Deseja voltar ao menu principal? ---\n(Pressione 1 para sim e 0 para nao)\n");
        scanf("%d", &decisor);
        if (decisor == 1){
            system("cls");
            goto menuprincipal;
        }
        break;

    case 3:
        decisor=0;
        Buscador();
        printf("\n\nPressone enter para continuar\n\n");
        getchar();
        system("cls");
        printf("--- Deseja voltar ao menu principal? ---\n(Pressione 1 para sim e 0 para nao)\n");
        scanf("%d", &decisor);
        if (decisor == 1){
            system("cls");
            goto menuprincipal;
        }
    break;
    }
}