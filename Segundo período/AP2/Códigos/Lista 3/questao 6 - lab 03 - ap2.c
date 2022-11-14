//      ENUNCIADO:

// Declarar o registro Ficha de Cliente que tem a seguinte forma: 
//                      Ficha de Cliente 
// Nome:                |  Endereço:       
// E-mail:              |  Idade:   |    Sexo:   |    CPF*: *Validade exercício 8    
// Data de nascimento:  |  Altura:  |    Peso:   |    IMC**:**a ser calculado

#include <stdio.h>

int validadordecpf(char *a)
{
    int cpf[11], aux[9], verificador[2];
    int soma;

    //atribuição de valor numérico 
    for (int i=0; i<11; i++)
    {
        cpf[i] = a[i] - '0';
    }

    //calculo do produto e soma
    for (int i=0, j=10; j>1, i<9; j--, i++)
    {
        aux[i] = j*cpf[i];
        soma += aux[i];
    }

    //calcula o primeiro digito validador
    if (soma%11<2 && soma%11>0)
    {
        verificador[0] = 0;
    }
    else
    {
        verificador[0] = 11 - (soma%11);
    }

    soma = 0;

    //calculo do produto e soma (segundo digito)
    for (int i=0, j=11; j>1, i<10; j--, i++)
    {
        aux[i] = j*cpf[i];
        soma += aux[i];
    }


    //calculo do segundo digito validador
    if (soma%11<2 && soma%11>0)
    {
        verificador[1] = 0;
    }else
    {
        verificador[1] = 11 - (soma%11);
    }

    //saída: resultado da validação
    if (verificador[0] != cpf[9] && verificador[1] != cpf[10])
    {
        printf("\nO cpf inserido e invalido.\n");
        return 1;
    }
    else
    {
        return 0;
    }
}

void main()
{
    struct dataNascimento
    {
        int dia, mes, ano;
    };

    struct fichadocliente
    {
        char nome[50], endereco[50], email[50], input[11], sexo;
        int idade;
        float altura, peso, imc;
        struct dataNascimento dma;
    }cliente;

    char *entrada = &cliente.input;

    printf("Escreva o nome do(a) cliente: \n");
    gets(cliente.nome);

    printf("\nEscreva o endereco do cliente: \n");
    gets(cliente.endereco);

    printf("\nEscreva o email do cliente: \n");
    gets(cliente.email);

    cpf:
    printf("\nInsira o cpf do cliente: \n");
    gets(cliente.input);

    fflush(stdin);

    if (validadordecpf(cliente.input) == 1)
    {
        goto cpf;
    }

    printf("\nInsira o genero do cliente: \n[F para feminino e M para masculino]\n");
    scanf("%c", &cliente.sexo);

    printf("\nEscreva a data de nascimento do cliente: \n");
    printf("\ndia: ");
    scanf("%d",&cliente.dma.dia);

    printf("\nmes: ");
    scanf("%d",&cliente.dma.mes);

    printf("\nano: ");
    scanf("%d",&cliente.dma.ano);

    printf("\nDigite a idade do cliente: ");
    scanf("%d",&cliente.idade);

    printf("\nDigite o peso do cliente:\n");
    scanf("%f",&cliente.peso);

    printf("\nDigite a altura do cliente: \n");
    scanf("%f",&cliente.altura);

    cliente.imc = cliente.peso/(cliente.altura*cliente.altura);

    system("cls");

    printf("\t\t\t FICHA DO CLIENTE");
    printf("\nNome: %s \t\tendereco: %s",cliente.nome,cliente.endereco);
    printf("\nEmail: %s \tIdade: %d \tSexo: %c  \tCPF: %s",cliente.email, cliente.idade ,cliente.sexo, cliente.input);
    printf("\nData de nascimento: %2d/%2d/%4d \tAltura: %.2f \tPeso: %.2f \tIMC: %.2f",cliente.dma.dia,cliente.dma.mes,cliente.dma.ano,cliente.altura,cliente.peso,cliente.imc);
}